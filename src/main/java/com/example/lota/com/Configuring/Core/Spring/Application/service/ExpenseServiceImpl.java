package com.example.lota.com.Configuring.Core.Spring.Application.service;

import com.example.lota.com.Configuring.Core.Spring.Application.doa.ExpenseDAO;
import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseDAO expenseDAO;
    public ExpenseServiceImpl(ExpenseDAO expenseDAO) {
        this.expenseDAO = expenseDAO;
        System.out.println("ExpenseService bean created!");
    }


    @Override
    public Expense addExpense(Expense expense) {
        Expense expense1 = new Expense(expense.getDescription(), expense.getCategory(), expense.getAmount());

        return expenseDAO.save(expense1);
    }

    @Override
    public void updateExpense(Expense expense) {
        expenseDAO.update(expense);
    }

    @Override
    public void deleteExpense(long id) {
        expenseDAO.delete(id);
    }

    @Override
    public void getExpense() {

    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseDAO.findAll();
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
