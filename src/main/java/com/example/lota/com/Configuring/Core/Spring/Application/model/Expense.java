package com.example.lota.com.Configuring.Core.Spring.Application.model;

import jakarta.persistence.*;

@Table(name = "expense")
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    private Category category;

    private double amount;

    public Expense() {
    }

    public Expense(Long id, String description, Category category, int amount) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "name='" + description + '\'' +
                '}';
    }
}
