package com.org;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

	@After("execution(public * com.org.EmployeeService.store(..))")
	public void log() {
		System.out.println("----- log method is called ------");
	}
	
	@After("execution(public * com.org.EmployeeService.*(int))")
	public void logM1() {
		System.out.println("----- 1 int param log method is called ------");
	}
	
	@After("execution(public * com.org.EmployeeService.*(int,int))")
	public void logM2() {
		System.out.println("----- 2 int param log method is called ------");
	}
	
	@After("execution(public * com.org.EmployeeService.*(int,String))")
	public void logM3() {
		System.out.println("-----2 param log method is called ------");
	}
	
	@After("execution(public * com.org.EmployeeService.*(String,String))")
	public void logM4() {
		System.out.println("----- 2 String param log method is called ------");
	}
	
	@Before("execution(public String com.org.EmployeeService.*())")
	public void logM5() {
		System.out.println("----- String log method is called ------");
	}
}
