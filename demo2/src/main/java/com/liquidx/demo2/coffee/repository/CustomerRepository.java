package com.liquidx.demo2.coffee.repository;

import com.liquidx.demo2.coffee.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
