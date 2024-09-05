package com.krishikart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishikart.app.entities.Order;

@Repository
public interface OrderRepo extends JpaRepository<Long, Order> {

}
