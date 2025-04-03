package com.example.lota.com.Configuring.Core.Spring.Application.service;

import com.example.lota.com.Configuring.Core.Spring.Application.doa.ExpenseDAO;
import com.example.lota.com.Configuring.Core.Spring.Application.dto.CreateExpenseDto;
import com.example.lota.com.Configuring.Core.Spring.Application.dto.UpdateExpenseDto;
import com.example.lota.com.Configuring.Core.Spring.Application.mappers.UserMapper;
import com.example.lota.com.Configuring.Core.Spring.Application.model.Category;
import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseDAO expenseDAO;
    private final UserMapper userMapper;
    public ExpenseServiceImpl(ExpenseDAO expenseDAO, UserMapper userMapper) {
        this.expenseDAO = expenseDAO;
        this.userMapper = userMapper;

        System.out.println("ExpenseService bean created!");
    }


    @Override
    @Transactional
    public Expense addExpense(CreateExpenseDto createExpenseDto) {
        if (createExpenseDto == null) {
            throw new IllegalArgumentException("Expense cannot be null");
        }
        if (expenseDAO.existsByDescription(createExpenseDto.getDescription())) {
            throw new IllegalArgumentException("Expense already exists");
        }
        Expense expense = new Expense(createExpenseDto.getDescription(), Category.valueOf(createExpenseDto.getCategory()), createExpenseDto.getAmount());

        return expenseDAO.save(expense);
    }

    @Override
    public void updateExpense(UpdateExpenseDto updateExpenseDto) {

        if (updateExpenseDto == null) {
            throw new IllegalArgumentException("Expense cannot be null");
        }

        if (!expenseDAO.existsById(updateExpenseDto.getId())) {
            throw new IllegalArgumentException("Id does not exist");
        }

        if (expenseDAO.existsByDescription(updateExpenseDto.getDescription())) {
            throw new IllegalArgumentException("Expense already exists");
        }

        Expense expense = expenseDAO.findById(updateExpenseDto.getId());
        Expense updatedExpense = userMapper.updateExpense(updateExpenseDto, expense);
        expenseDAO.update(updatedExpense);
    }

    @Override
    @Transactional
    public void deleteExpense(Long id) {
        if (!expenseDAO.existsById(id)) {
            throw new IllegalArgumentException("Id does not exist");
        }
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
