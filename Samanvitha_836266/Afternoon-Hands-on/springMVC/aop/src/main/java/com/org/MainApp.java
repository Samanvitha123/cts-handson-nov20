package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.delete();
		service.store();
		String msg=service.oneParam();
		System.out.println(msg);
		service.oneParam(10);
		service.twoParam(10, 1000);
		service.twoParam(10, "Navya");
		service.twoParam("Navya", "Hello");
		
		
		
	}

}
