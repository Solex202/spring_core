package com.example.lota.com.Configuring.Core.Spring.Application.service;

import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;

import java.util.List;

public interface ExpenseService {

    public Expense addExpense(Expense expense);

    public void updateExpense(Expense expense);

    public void deleteExpense(long id);

    public void getExpense();

    public List<Expense> getAllExpenses();

    public void getExpenseByCategory();

    public void getExpenseByDate();

    public void getExpenseByMonth();

    public void getExpenseByYear();

    public void getExpenseByCategoryAndDate();

    public void getExpenseByCategoryAndMonth();

    public void getExpenseByCategoryAndYear();

}
