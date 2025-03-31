package com.example.lota.com.Configuring.Core.Spring.Application.dto;

public class CreateExpenseDto {

    private String description;

    private String category;

    private double amount;

    public CreateExpenseDto(String description, String category, double amount){
        this.description = description;
        this.category = category;
        this.amount = amount;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public double getAmount(){
        return amount;
    }
}
