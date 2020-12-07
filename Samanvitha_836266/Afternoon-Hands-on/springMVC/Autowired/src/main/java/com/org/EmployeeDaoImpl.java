package com.org;

public class EmployeeDaoImpl implements EmployeeDao {
	
private Employee employee;
	public void store() {
	
		System.out.println("Store() of EmployeeDaoImpl");
		System.out.println("Name: "+employee.getName()+" Id: "+employee.getId());
	}
	
	public void setEmployee(Employee employee)
	{
		this.employee=employee;
	}
}
