package com.krishikart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.krishikart.app.entities.Farmer;

@Repository
public interface FarmerRepo extends JpaRepository<Long, Farmer> {

}
