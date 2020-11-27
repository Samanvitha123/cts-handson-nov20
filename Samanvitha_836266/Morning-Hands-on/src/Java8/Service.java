package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
	List<Employee> employee=new ArrayList<>();
	
	public void addEmployees(Employee e)
	{
	 employee.add(e);
	}
	public Employee findByID(int id)
	{
		for(Employee emp:employee)
		{
		if(emp.getId()==id)
			return emp;
	    }
		return null;
	}
	public List<Employee> getEmployees()
	{ 
		
		return employee;
	}
		
	public List<Employee> sortEmployeeById()
	{
		Collections.sort(employee,(e1,e2)->e1.getId()-e2.getId());
		return employee;
	}
	public List<Employee> sortEmployeeByName()
	{
		Collections.sort(employee,(e1,e2)-> e1.getName().compareTo(e2.getName()));
		return employee;
	}
	
	public List<Employee> sortEmployeeBySalary()
	{
		Collections.sort(employee,(e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
		return employee;
	}
	public List<Employee> sortEmployeeByDob()
	{
		Collections.sort(employee,(e1,e2)->e1.getDob().compareTo(e2.getDob()));
		return employee;
	}
	
	
	
	

}
