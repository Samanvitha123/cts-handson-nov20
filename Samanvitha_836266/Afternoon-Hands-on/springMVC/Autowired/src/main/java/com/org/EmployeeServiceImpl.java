package com.org;

public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDaoImpl employeeDaoImpl;
	
	public void storeEmployee() {
       System.out.println("Calling store() of EmployeeDaoImpl class from storeEmployee() of EmployeeServiceImpl class");
		employeeDaoImpl.store();
		
		}
	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl)
	{
		this.employeeDaoImpl=employeeDaoImpl;
	}

}
