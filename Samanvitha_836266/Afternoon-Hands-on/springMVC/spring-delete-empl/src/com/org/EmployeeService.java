package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public void storeEmployee(Employee emp)
	{
		dao.store(emp);
	}
	
	public void deleteEmployee(int id)
	{
		dao.delete(id);
	}
	

}
