package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Bruce");
		emp.setSalary(55000);
		service.storeEmployee(emp);
	}
}
