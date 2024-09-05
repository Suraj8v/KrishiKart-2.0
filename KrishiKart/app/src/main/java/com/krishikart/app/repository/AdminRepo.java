package com.krishikart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishikart.app.entities.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Long, Admin> {

}
