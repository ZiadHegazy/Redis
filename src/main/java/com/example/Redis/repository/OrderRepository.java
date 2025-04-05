package com.example.Redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Redis.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
