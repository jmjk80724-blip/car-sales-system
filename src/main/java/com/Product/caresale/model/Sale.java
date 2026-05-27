package com.Product.caresale.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private  Car car;
    private Double salePrice;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate saleDate;
}
