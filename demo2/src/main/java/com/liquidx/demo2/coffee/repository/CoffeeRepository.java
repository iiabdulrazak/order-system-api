package com.liquidx.demo2.coffee.repository;

import com.liquidx.demo2.coffee.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long>{
    
}
