package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public void store() {
		System.out.println("**** store() inside EmployeeService ****");
	}
	
	public void delete() {
		System.out.println("*** delete() inside EmployeeService ****");
	}
	
	public void oneParam(int id)
	{
		System.out.println("***Method with 1 int parameter***"+"Id: "+id);
	}
	
	public void twoParam(int id,String name)
	{
	System.out.println("***Method with int,String parameters***"+"Id: "+id+" Name: "+name);
	}
	
	public void twoParam(int id,int salary)
	{
		System.out.println("***Method with 2 int parameters***"+"Id: "+id+" Salary: "+salary);
	}
	
	public void twoParam(String name,String msg)
	{
		System.out.println("***Method with 2 String parameters**"+"Name: "+name+" Msg: "+msg);
	}
	public String oneParam() 
	{
		return "***Method with String return type***";
	}
}
