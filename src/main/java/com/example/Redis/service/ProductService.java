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
    private OrderRepository orderRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }


    @Cacheable(value = "product",key = "#id")
    public Product getProductById(int id){
        return productRepository.findById(id).get();
    }
    @Cacheable(value="order",key="#id")
    public Order getOrderById(int id){
        return orderRepository.findById(id).get();
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    public Order addOrder(Order order){
        return orderRepository.save(order);
    }

}
