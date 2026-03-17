package com.systems.payments.dto;

import java.time.LocalDate;

import com.systems.payments.entity.enums.TypePayment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewPaymentDTO {
    private double amount;
    private TypePayment typePayment;
    private LocalDate date;
    private String codeStudent;
}
