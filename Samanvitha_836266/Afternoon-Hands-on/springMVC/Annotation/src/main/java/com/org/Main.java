package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeServiceImpl service=(EmployeeServiceImpl) ctx.getBean("employeeServiceImpl");
		service.storeEmployee();
	}

}
