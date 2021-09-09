package com.liquidx.demo2.coffee.resoure;

import com.liquidx.demo2.coffee.service.CoffeeService;
import com.liquidx.demo2.coffee.model.Coffee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/coffee")
public class CoffeeController {
    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }
    
    @GetMapping
        public List<Coffee> getCoffees(){
            return coffeeService.getCoffees();
                  
     }  
}
