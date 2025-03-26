package com.example.lota.com.Configuring.Core.Spring.Application;

import com.example.lota.com.Configuring.Core.Spring.Application.config.ExpenseConfig;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ConfiguringCoreSpringApplication {
	public static void main(String[] args) throws Exception {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		Context ctx = tomcat.addContext("", System.getProperty("java.io.tmpdir"));

		// Create context WITHOUT manual refresh
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(ExpenseConfig.class);

		// Create servlet with the context
		DispatcherServlet servlet = new DispatcherServlet(appContext);

		// Register servlet with Tomcat
		Tomcat.addServlet(ctx, "dispatcher", servlet);
		ctx.addServletMappingDecoded("/*", "dispatcher");

		tomcat.start();
		tomcat.getServer().await();
	}
}