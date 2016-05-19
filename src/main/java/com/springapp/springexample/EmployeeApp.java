package com.springapp.springexample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		context.registerShutdownHook();
		Employee employee = (Employee) context.getBean("employee");
		employee.draw();
		context.close();
	}
}
