package com.systems.payments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.systems.payments.entity.Payment;
import com.systems.payments.entity.enums.PaymentStatus;
import com.systems.payments.entity.enums.TypePayment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
    List<Payment> findByStudentCode (String codeStudent);

    List<Payment> findByPaymentStatus(PaymentStatus paymentStatus);

    List<Payment> findByTypePayment(TypePayment typePayment);
}
