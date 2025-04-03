package com.example.lota.com.Configuring.Core.Spring.Application.dto;

public class UpdateExpenseDto {

    private Long id;
    private String description;

    private String category;

    private double amount;

    public UpdateExpenseDto() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }
}
