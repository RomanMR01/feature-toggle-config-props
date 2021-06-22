package com.epam.feature.toggle.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    private String code;

    private String name;

    private String image;

    private double rating;

    private String description;
}