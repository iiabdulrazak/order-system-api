package com.liquidx.demo2.coffee.model;

import javax.persistence.*;

@Entity
@Table
public class Coffee {
    @Id
    @SequenceGenerator(
            name = "coffee_sequence",
            sequenceName = "coffee_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "coffee_sequence"
    )
    
    private Long id;
    private String name;
    private Double price;

    public Coffee() {
    }

    public Coffee(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Coffee(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
    
}
