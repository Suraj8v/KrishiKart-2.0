package com.krishikart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishikart.app.entities.Address;

@Repository
public interface AddressRepo extends JpaRepository<Long, Address> {

}
