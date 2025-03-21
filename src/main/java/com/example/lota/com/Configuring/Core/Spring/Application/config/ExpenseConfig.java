package com.example.lota.com.Configuring.Core.Spring.Application.config;

import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class ExpenseConfig {

    @Bean
    @Primary
    public Expense expense() {
        Expense exp = new Expense();
        exp.setName("Bills");
        return exp;
    }
    @Bean("foodie")
    public Expense expense2( Expense expense) {
        Expense exp = new Expense();
        exp.setName("Food");
        return exp;
    }
}
