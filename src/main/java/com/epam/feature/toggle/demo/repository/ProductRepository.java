package com.epam.feature.toggle.demo.repository;

import com.epam.feature.toggle.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {

    Product findByCode(String code);
}