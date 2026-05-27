package com.Product.caresale.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer extends  Person {
    private String city;
    private String country;
    private String  licenseNumber;
    private String address;

}