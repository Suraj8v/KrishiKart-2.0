package com.krishikart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishikart.app.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Long, Product> {

}
