package com.atmosware.testdemo.business.concretes;

import com.atmosware.testdemo.entities.concretes.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class CreditCardManager {
    List<CreditCard> creditCards = new ArrayList<CreditCard>();

    public CreditCardManager(){
        creditCards.add(new CreditCard("Mehmet Yurdakul","1111","123","25-01-2023"));
    }

    public void addCreditCard(CreditCard creditCard){
        creditCards.add(creditCard);
    }
}
