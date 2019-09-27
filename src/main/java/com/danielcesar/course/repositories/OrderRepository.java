package com.danielcesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcesar.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
