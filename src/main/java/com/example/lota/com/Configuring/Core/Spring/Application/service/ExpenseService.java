package com.example.lota.com.Configuring.Core.Spring.Application.service;

import com.example.lota.com.Configuring.Core.Spring.Application.doa.ExpenseDAO;
import org.springframework.stereotype.Component;

@Component
public class ExpenseService {

    private final ExpenseDAO expenseDAO;
    public ExpenseService(ExpenseDAO expenseDAO) {
        this.expenseDAO = expenseDAO;
        System.out.println("ExpenseService bean created!");
    }

}
