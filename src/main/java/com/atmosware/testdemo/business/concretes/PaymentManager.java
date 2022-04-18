package com.atmosware.testdemo.business.concretes;

import com.atmosware.testdemo.business.common.exceptions.BusinessException;
import com.atmosware.testdemo.entities.concretes.CreditCard;
import com.atmosware.testdemo.entities.concretes.Customer;
import com.atmosware.testdemo.entities.concretes.CustomerBalance;
import com.atmosware.testdemo.entities.concretes.Payment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    List<Payment> payments = new ArrayList<Payment>();
    List<Customer> customers =new ArrayList<Customer>();
    List<CreditCard> creditCards = new ArrayList<CreditCard>();
    List<CustomerBalance> customerBalances= new ArrayList<CustomerBalance>();



    public void addPayment(Payment payment){
//        customers.add(new Customer(1,"Mehmet","Yurdakul"));
        checkIfCustomerExists(payment.getCustomerId());
        checkExpDate(payment.getDate());
        checkBalance(payment.getTotal(),payment.getCustomerId());
        payments.add(payment);
    }

    private void checkBalance(double total, int customerId) {
        for (Customer currentCustomer:customers) {
            if(currentCustomer.getId()==customerId){
                for (CustomerBalance currentCustomerBalance: customerBalances) {
                    if (currentCustomerBalance.getCustomerId()== currentCustomer.getId()){
                        if(currentCustomerBalance.getBalance()<total){
                            throw new BusinessException("Bakiye yetersiz.");
                        }
                    }
                }
            }
        }
    }

    private void checkExpDate(LocalDate date) {
        for (CreditCard currentCreditCard: creditCards) {
            String expDate = currentCreditCard.getExpiration();
            LocalDate localDate = LocalDate.parse(expDate);
            if(localDate.isBefore(date)){
                throw new BusinessException("Kartın süresi geçmiş.");
            }
        }
    }

    private void checkIfCustomerExists(int customerId) {
        for (Customer currentCustomer: customers) {
            if (currentCustomer.getId() != customerId){
                throw new BusinessException("Müşteri bulunamadı.");
            }
        }
    }
}
