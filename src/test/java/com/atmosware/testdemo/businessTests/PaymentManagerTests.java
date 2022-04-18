package com.atmosware.testdemo.businessTests;

import com.atmosware.testdemo.business.common.exceptions.BusinessException;
import com.atmosware.testdemo.business.concretes.CustomerManager;
import com.atmosware.testdemo.business.concretes.MathManager;
import com.atmosware.testdemo.business.concretes.PaymentManager;
import com.atmosware.testdemo.entities.concretes.Customer;
import com.atmosware.testdemo.entities.concretes.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

public class PaymentManagerTests {
    PaymentManager paymentManager;

    @BeforeEach
    public void setup(){
        paymentManager = new PaymentManager();
    }
    @Test
    public void should_throw_exception_if_customer_not_exists(){

        CustomerManager customerManager= new CustomerManager();
        Customer customer = new Customer(1,"Mehmet","Yurdakul");
        customerManager.addCustomer(customer);

        Executable executable = () -> paymentManager.addPayment(new Payment(1,1,2,1, LocalDate.now()));

        Assertions.assertThrows(BusinessException.class,executable);
    }

}
