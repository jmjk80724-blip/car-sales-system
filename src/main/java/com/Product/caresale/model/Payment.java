package com.Product.caresale.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Sale sale;

    private double amount;
    private String description;
    private String method;
    private String paymentDate;

}
