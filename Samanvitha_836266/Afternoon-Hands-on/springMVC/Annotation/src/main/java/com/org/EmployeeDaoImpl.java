package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
@Autowired	
private Employee employee;

	public void store() {
	
		System.out.println("Store() of EmployeeDaoImpl");
		employee.setName("Navya");
		employee.setId(1);
		System.out.println("Name: "+employee.getName()+" Id: "+employee.getId());
	}
	public void setEmployee(Employee employee)
	{
		this.employee=employee;
	}
	

}
