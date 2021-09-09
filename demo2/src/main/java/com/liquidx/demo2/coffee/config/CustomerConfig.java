package com.liquidx.demo2.coffee.config;

import com.liquidx.demo2.coffee.model.Customer;
import com.liquidx.demo2.coffee.repository.CustomerRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner2(CustomerRepository repository){
        return args -> {
                Customer abdulrazak = new Customer(
                            1L,
                            "Abdulrazak",
                            "0547079680"
                    );
                Customer abdulraqeeb = new Customer(
                            2L,
                            "Abdulraqeeb",
                            "0547079680"
                    );
                Customer adnan = new Customer(
                            3L,
                            "Adnan",
                            "0547079680"
                    );
                repository.saveAll(
                        List.of(abdulrazak, abdulraqeeb, adnan)
                );
            };
      }
}
