package com.example.lota.com.Configuring.Core.Spring.Application;

import com.example.lota.com.Configuring.Core.Spring.Application.config.ExpenseConfig;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Arrays;

public class ConfiguringCoreSpringApplication {
	public static void main(String[] args) throws Exception {
//		ApplicationContext context = new AnnotationConfigApplicationContext(ExpenseConfig.class);
//		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(8081);
		tomcat.getServer().setPort(8081);

		Context ctx = tomcat.addWebapp("", System.getProperty("java.io.tmpdir"));

		WebApplicationContext appContext = createWebApplicationContext();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(appContext);
		Tomcat.addServlet(ctx, "dispatcher", dispatcherServlet);
		ctx.addServletMappingDecoded("/", "dispatcher");

		System.out.println("Tomcat starting...");
		tomcat.start();
		tomcat.getServer().getPort();
		System.out.println("Tomcat host =======================>> " + tomcat.getHost());
		System.out.println("Tomcat port =======================>> " + tomcat.getServer().getPort());
		System.out.println("Tomcat started!");

		tomcat.getServer().await();


	}

	private static WebApplicationContext createWebApplicationContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ExpenseConfig.class);
		return context;
	}
}