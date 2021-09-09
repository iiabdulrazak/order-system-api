package com.liquidx.demo2.coffee.resoure;

import com.liquidx.demo2.coffee.model.Customer;
import com.liquidx.demo2.coffee.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;
    
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    @GetMapping
        public List<Customer> getCustomers(){
            return customerService.getCustomers();     
     }  
    
}
