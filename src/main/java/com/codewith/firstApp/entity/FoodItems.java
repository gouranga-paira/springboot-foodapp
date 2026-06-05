package com.codewith.firstApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FoodItems {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) //check why jakarta.persistence is used while in the video its not used.
    private Long id;
    private String name;
    private double price;

    public FoodItems() {
    }

    public FoodItems(Long id, String name, double price) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
