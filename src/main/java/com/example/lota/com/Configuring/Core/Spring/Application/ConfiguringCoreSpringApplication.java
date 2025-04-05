package com.example.lota.com.Configuring.Core.Spring.Application;

import com.example.lota.com.Configuring.Core.Spring.Application.config.ExpenseConfig;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Arrays;

public class ConfiguringCoreSpringApplication {
	public static void main(String[] args) throws Exception {
//		ApplicationContext context = new AnnotationConfigApplicationContext(ExpenseConfig.class);
//		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		System.out.println(getPort(new int[]{4,5,6,5,4}));

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8081);

		Context ctx = tomcat.addWebapp("", System.getProperty("java.io.tmpdir"));

		WebApplicationContext appContext = createWebApplicationContext();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(appContext);
		Tomcat.addServlet(ctx, "dispatcher", dispatcherServlet);
		ctx.addServletMappingDecoded("/", "dispatcher");

		System.out.println("Tomcat starting...");
		tomcat.start();
		System.out.println("Tomcat host =======================>> " + tomcat.getHost());
		System.out.println("Tomcat port =======================>> " + tomcat.getConnector().getPort());
		System.out.println("Tomcat started!");

		tomcat.getServer().await();
	}

	public static int getPort(int [] arr) {
		int arrLength = arr.length;
		int sum = 0;
		for (int i = 0; i < arrLength; i++) {
			sum += arr[i];

			for (int j = i + 1; j < arrLength; j++) {
				if (arr[i] == arr[j]) {
					arrLength --;
					arr[j] = arr[arrLength];
					arr[arrLength] = 0;
				}
			}

		}
		return sum;
	}
	private static WebApplicationContext createWebApplicationContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ExpenseConfig.class);
		return context;
	}
}