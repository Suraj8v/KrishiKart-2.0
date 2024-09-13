package com.krishikart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishikart.app.entities.BuyerCart;

@Repository
public interface BuyerCartRepo extends JpaRepository<BuyerCart,Long> {

}
