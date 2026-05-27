package com.Product.caresale.service;

import com.Product.caresale.model.Payment;
import com.Product.caresale.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

}
