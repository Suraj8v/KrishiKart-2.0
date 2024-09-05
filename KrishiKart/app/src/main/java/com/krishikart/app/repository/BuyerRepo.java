package com.krishikart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishikart.app.entities.Buyer;

@Repository
public interface BuyerRepo extends JpaRepository<Long, Buyer> {

}
