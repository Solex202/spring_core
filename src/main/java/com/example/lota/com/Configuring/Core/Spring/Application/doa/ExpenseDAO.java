package com.example.lota.com.Configuring.Core.Spring.Application.doa;

import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ExpenseDAO {


    private final SessionFactory sessionFactory;

    public ExpenseDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public void save(Expense expense){
        System.out.println("ExpenseDAO: save method");
        sessionFactory.getCurrentSession().saveOrUpdate(expense);
    }

    public void update(){
        System.out.println("ExpenseDAO: update method");
    }

    public void delete(){
        System.out.println("ExpenseDAO: delete method");
        sessionFactory.getCurrentSession().createQuery("DELETE FROM Expense WHERE id = :id")
                .setParameter("id", 1)
                .executeUpdate();
    }

    public void findAll(){
        System.out.println("ExpenseDAO: findAll method");
        sessionFactory.getCurrentSession().createQuery("FROM Expense", Expense.class)
                .getResultList();
    }

    public void findById(){
        System.out.println("ExpenseDAO: findById method");
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
