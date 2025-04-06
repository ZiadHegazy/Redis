package com.example.Redis.service;

import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.Redis.model.Order;
import com.example.Redis.model.Product;
import com.example.Redis.repository.OrderRepository;
import com.example.Redis.repository.ProductRepository;


@Service
public class ProductService {

    private ProductRepository  productRepository;
    

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



}
