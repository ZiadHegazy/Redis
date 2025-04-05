package com.example.Redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Redis.model.Order;
import com.example.Redis.model.Product;
import com.example.Redis.reflection.TestReflection;
import com.example.Redis.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    TestReflection testReflection;

    @GetMapping("/reflection")
    public void testReflection() throws Exception {
        testReflection.testReflection();;
    }

    @PostMapping("/")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @PostMapping("/order")
    public Order addOrder(@RequestBody Order order){
        return productService.addOrder(order);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable int id){
        return productService.getOrderById(id);
    }

}
