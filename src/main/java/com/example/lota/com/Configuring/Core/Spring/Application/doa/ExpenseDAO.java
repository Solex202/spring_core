package com.example.lota.com.Configuring.Core.Spring.Application.doa;

import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class ExpenseDAO {


    private final SessionFactory sessionFactory;

    public ExpenseDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Expense save(Expense expense){
        System.out.println("ExpenseDAO: save method");
        sessionFactory.getCurrentSession().save(expense);

        return expense;
    }

    public Expense update(Expense expense){
        System.out.println("ExpenseDAO: update method");
        sessionFactory.getCurrentSession().update(expense);
        return expense;
    }

    public void delete(long id){
        System.out.println("ExpenseDAO: delete method");
        Session session = sessionFactory.getCurrentSession();
        Expense expense = session.get(Expense.class, id);
              if (expense != null){
                  session.delete(expense);
              }
    }

    public List<Expense> findAll(){
        System.out.println("ExpenseDAO: findAll method");
       return sessionFactory.getCurrentSession()
               .createQuery("FROM Expense", Expense.class)
                .getResultList();
    }

    public Expense findById(long id){
        System.out.println("ExpenseDAO: findById method");
        Session session = sessionFactory.getCurrentSession();
        Expense expense = session.get(Expense.class, id);
        return expense;
    }

    public void findByAmount(){
        System.out.println("ExpenseDAO: findByAmount method");
    }

    public void findByDate(){
        System.out.println("ExpenseDAO: findByDate method");
    }

    public void findByCategory(){
        System.out.println("ExpenseDAO: findByCategory method");
    }


    public void findByUser(){
        System.out.println("ExpenseDAO: findByUser method");
    }

    public void findByUserAndAmount(){
        System.out.println("ExpenseDAO: findByUserAndAmount method");
    }

    public void findByUserAndDate(){
        System.out.println("ExpenseDAO: findByUserAndDate method");
    }

    public void findByUserAndCategory(){
        System.out.println("ExpenseDAO: findByUserAndCategory method");
    }

    public void findByUserAndDescription(){
        System.out.println("ExpenseDAO: findByUserAndDescription method");
    }

    public void findByUserAndUser(){
        System.out.println("ExpenseDAO: findByUserAndUser method");
    }

    public void findByUserAndUserAndAmount(){
        System.out.println("ExpenseDAO: findByUserAndUserAndAmount method");
    }

    public void findByUserAndUserAndDate(){
        System.out.println("ExpenseDAO: findByUserAndUserAndDate method");
    }

    public void findByUserAndUserAndCategory() {
        System.out.println("ExpenseDAO: findByUserAndUserAndCategory");
    }
}
