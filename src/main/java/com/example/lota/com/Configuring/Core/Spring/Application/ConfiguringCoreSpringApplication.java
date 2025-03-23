package com.example.lota.com.Configuring.Core.Spring.Application;


import com.example.lota.com.Configuring.Core.Spring.Application.config.ExpenseConfig;
import com.example.lota.com.Configuring.Core.Spring.Application.model.Expense;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfiguringCoreSpringApplication {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new AnnotationConfigApplicationContext(ExpenseConfig.class);
//		System.out.println(context.getBeansOfType(Expense.class));
		Thread.currentThread().join();

	}

}
