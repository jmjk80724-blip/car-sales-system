package com.Product.caresale.Controller;

import com.Product.caresale.model.Payment;
import com.Product.caresale.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @PostMapping
    public Payment addPayment(@RequestBody Payment payment){
        return paymentService.savePayment(payment);
    }
    @GetMapping
    public List<Payment>  getAllPayments() {
        return paymentService.getAllPayments();
    }
}
