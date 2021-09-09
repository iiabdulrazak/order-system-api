package com.liquidx.demo2.coffee.service;

import com.liquidx.demo2.coffee.model.Coffee;
import com.liquidx.demo2.coffee.repository.CoffeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {
    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }
    
    @Autowired
    public List<Coffee> getCoffees(){
            return coffeeRepository.findAll();
     }
}
