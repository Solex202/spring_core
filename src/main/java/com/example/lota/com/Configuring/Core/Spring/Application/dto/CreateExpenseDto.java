package com.example.lota.com.Configuring.Core.Spring.Application.dto;

import com.example.lota.com.Configuring.Core.Spring.Application.model.Category;

public class CreateExpenseDto {

    private String description;

    private String category;

    private double amount;

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
}
