package com.atmosware.testdemo.business.concretes;

import com.atmosware.testdemo.entities.concretes.Customer;
import com.atmosware.testdemo.entities.concretes.CustomerBalance;

import java.util.ArrayList;
import java.util.List;

public class CustomerBalanceManager {
    List<CustomerBalance> customerBalances = new ArrayList<CustomerBalance>();

    public CustomerBalanceManager(){
        customerBalances.add(new CustomerBalance(1,1,20));
    }

    public void addCustomerBalance(CustomerBalance customerBalance){
        customerBalances.add(customerBalance);
    }
}
