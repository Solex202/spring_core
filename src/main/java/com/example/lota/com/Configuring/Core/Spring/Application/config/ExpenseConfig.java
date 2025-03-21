package com.example.lota.com.Configuring.Core.Spring.Application.config;

import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

@Configuration
@Component
public class ExpenseConfig {

    @Bean
    @Primary
    public Expense expense() {
        Expense exp = new Expense();
        exp.setDescription("Bills");
        return exp;
    }

    @Bean
   public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/expense");
        dataSource.setUsername("postgres");
        dataSource.setPassword("password");
        return dataSource;
    }
}
