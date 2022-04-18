package com.atmosware.testdemo.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentRequest {
    private double total;
    private int customerId;
    private int transactionId;
    private LocalDate date;
}
