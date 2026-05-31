package com.Product.caresale.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import jakarta.validation.constraints.Min;

@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Brand is required! ")
    private  String brand;

    @NotBlank(message = "Model is required! ")
    private  String model;

    @Positive(message ="Price must be positive")
    private double price;

    @NotBlank(message = "Color is required!")
    private String color;

    @Min(value = 2000, message = "Year must be after 2000!")
    private int year;


}
