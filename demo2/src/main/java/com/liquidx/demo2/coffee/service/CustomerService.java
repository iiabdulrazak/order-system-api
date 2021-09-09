package com.liquidx.demo2.coffee.service;

import com.liquidx.demo2.coffee.model.Customer;
import com.liquidx.demo2.coffee.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;  

    public CustomerService(CustomerRepository customerRepository1) {
        this.customerRepository = customerRepository1;
    }
    
    @Autowired
    public List<Customer> getCustomers(){
            return customerRepository.findAll();
    }
}
