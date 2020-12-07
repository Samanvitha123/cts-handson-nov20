package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
     
	@Autowired
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
