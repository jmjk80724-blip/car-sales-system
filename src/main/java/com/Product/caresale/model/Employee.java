package com.Product.caresale.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "employees")

public class Employee  extends Person{
    private String position;
    private double salary;

}
