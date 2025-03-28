package com.example.lota.com.Configuring.Core.Spring.Application.controller;

import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import com.example.lota.com.Configuring.Core.Spring.Application.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/expenses")
public class ExpenseRestController {

    private final ExpenseService expenseService;
    public ExpenseRestController(ExpenseService expenseService) {
        this.expenseService = expenseService;
        System.out.println("ExpenseRestController bean created!");
    }

    @PostMapping("/add")
    public void addExpense(@RequestBody Expense expense){
        expenseService.addExpense(expense);
        System.out.println("ExpenseRestController: addExpense method");
    }

    @GetMapping("/ping")
    public String ping() {
        return "Server is running!";
    }

}
