package com.Product.caresale.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="person")
@DiscriminatorColumn(name = "person_type")
public abstract class Person {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private  Long id;
        private String name;
        private int age;
        private String phone;



    }
