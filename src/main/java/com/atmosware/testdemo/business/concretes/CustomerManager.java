package com.atmosware.testdemo.business.concretes;

import com.atmosware.testdemo.entities.concretes.Customer;
import com.atmosware.testdemo.entities.concretes.Payment;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    List<Customer> customers = new ArrayList<Customer>();

    public CustomerManager(){
        customers.add(new Customer(1,"Mehmet","Yurdakul"));
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }
}
