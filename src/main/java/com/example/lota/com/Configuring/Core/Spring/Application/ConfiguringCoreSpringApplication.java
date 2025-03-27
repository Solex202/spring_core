package com.example.lota.com.Configuring.Core.Spring.Application;

import com.example.lota.com.Configuring.Core.Spring.Application.config.ExpenseConfig;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.Context;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ConfiguringCoreSpringApplication {
	public static void main(String[] args) throws Exception {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		// Create proper web application context
		Context ctx = tomcat.addWebapp("", System.getProperty("java.io.tmpdir"));

		// Initialize Spring context PROPERLY
		WebApplicationContext appContext = createWebApplicationContext();

		// Add Spring dispatcher servlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(appContext);
		Tomcat.addServlet(ctx, "dispatcher", dispatcherServlet);
		ctx.addServletMappingDecoded("/*", "dispatcher");

		tomcat.start();
		tomcat.getServer().await();
	}

	private static WebApplicationContext createWebApplicationContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ExpenseConfig.class);
		return context;
	}
}