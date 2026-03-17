package com.systems.payments.entity;

import java.time.LocalDate;

import com.systems.payments.entity.enums.PaymentStatus;
import com.systems.payments.entity.enums.TypePayment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder // Su función principal es facilitar la creación de objetos complejos sin tener
         // que lidiar con constructores gigantes o muchas líneas de código "setter".
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private LocalDate date;

        private double amount;

        private TypePayment typePayment;

        private PaymentStatus paymentStatus;

        private String file;

        @ManyToOne
        private Student student;
}
