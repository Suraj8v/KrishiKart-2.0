package com.krishikart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishikart.app.entities.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Long, Payment> {

}
