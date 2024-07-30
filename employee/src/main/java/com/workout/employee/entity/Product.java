package com.workout.employee.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Product {

    public int id;
    public String name;
    public float price;

    public Product(int id, String name, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
