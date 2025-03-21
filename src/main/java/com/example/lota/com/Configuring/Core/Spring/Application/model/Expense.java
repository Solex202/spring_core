package com.example.lota.com.Configuring.Core.Spring.Application.model;

import jakarta.persistence.Table;

@Table(name = "expense")
public class Expense {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    private Category category;
}
