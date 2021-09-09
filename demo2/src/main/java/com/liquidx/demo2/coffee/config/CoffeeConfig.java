package com.liquidx.demo2.coffee.config;

import com.liquidx.demo2.coffee.model.Coffee;
import com.liquidx.demo2.coffee.repository.CoffeeRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeConfig {
    @Bean
    CommandLineRunner commandLineRunner1(CoffeeRepository repository){
        return args -> {
            Coffee blackCoffee= new Coffee(
                    "Black Coffee",
                    33.3
            );
            Coffee navvanaCoffee= new Coffee(
                    "Navanna Coffee",
                    18.7
            );
            Coffee iceWhiteCoffee= new Coffee(
                    "Ice White Mocca Coffee",
                    31.9
            );
            Coffee iceCaramelCoffee= new Coffee(
                    "Ice Caramel Mocca Coffee",
                    21.0
            );
            repository.saveAll(
                    List.of(blackCoffee, navvanaCoffee, iceWhiteCoffee, iceCaramelCoffee)
            );
        };
    }
}
