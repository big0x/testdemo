package com.atmosware.testdemo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private int id;
    private double total;
    private int customerId;
    private int transactionId;
    private LocalDate date;
}

//add payment requestlerle
//müşteri sistemde olması gerekir.
//exp.date bu aydan önce olması gerekir.
//banka sisteminin kredi kartına onay vermesi gerekir.

