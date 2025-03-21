package com.example.lota.com.Configuring.Core.Spring.Application.service;

import com.example.lota.com.Configuring.Core.Spring.Application.doa.ExpenseDAO;
import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import org.springframework.stereotype.Component;

@Component
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseDAO expenseDAO;
    public ExpenseServiceImpl(ExpenseDAO expenseDAO) {
        this.expenseDAO = expenseDAO;
        System.out.println("ExpenseService bean created!");
    }


    @Override
    public Expense addExpense(Expense expense) {
        return expenseDAO.save(expense);
    }

    @Override
    public void updateExpense(Expense expense) {
        expenseDAO.update(expense);
    }

    @Override
    public void deleteExpense() {

    }

    @Override
    public void getExpense() {

    }

    @Override
    public void getAllExpenses() {

    }

    @Override
    public void getExpenseByCategory() {

    }

    @Override
    public void getExpenseByDate() {

    }

    @Override
    public void getExpenseByMonth() {

    }

    @Override
    public void getExpenseByYear() {

    }

    @Override
    public void getExpenseByCategoryAndDate() {

    }

    @Override
    public void getExpenseByCategoryAndMonth() {

    }

    @Override
    public void getExpenseByCategoryAndYear() {

    }
}
