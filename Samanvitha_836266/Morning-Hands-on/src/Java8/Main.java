package java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		 //Employee e=new Employee();
		 Service s=new Service();
		 List<Employee> emp=new ArrayList<>();
		do
		{
			System.out.println("1.Add \n2.FindById \n3.Display All \n4.Sort by Id \n5.Sort by name\n6.Sort by Salary\n7.Sort by DOB\n8.Exit");
			System.out.println();
			System.out.println("Enter option: ");
			i=sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("Enter id: ");
			        int id=sc.nextInt();
			       	 System.out.println("Enter name: ");
			        String name=sc.next();
			        System.out.println("Enter Salary");
			        double sal=sc.nextDouble();
			        System.out.println("Enter DOB");
			        String date=sc.next();
			        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			        LocalDate dob=LocalDate.parse(date,formatter);
			        Employee employee=new Employee(id,name,dob,sal);
			        s.addEmployees(employee);
			        
			        System.out.println("Added employee details!");
			        break;
			        
			case 2:System.out.println("Enter ID: ");
			       int Id=sc.nextInt();
			       Employee e= s.findByID(Id);   
			       System.out.println("Name: "+e.getName()+" DOB: "+e.getDob()+" Salary: "+e.getSalary());
			       break;
			       
			case 3: System.out.println("Displaying all details of Employee's");
			        emp=s.getEmployees();
			        emp.forEach(k -> System.out.println(k));
			        break;
			        
			case 4: System.out.println("Sorting by ID: ");
			        emp=s.sortEmployeeById();
			        emp.forEach(k-> System.out.println(k));
			        break;
			        
			case 5: System.out.println("Sorting by Name: ");
			        emp=s.sortEmployeeByName();
			        emp.forEach(k->System.out.println(k));
			        break;
			        
			case 6: System.out.println("Sorting by Salary: ");
	                emp=s.sortEmployeeBySalary();
	                emp.forEach(k->System.out.println(k));
	                break;
	                
			case 7:System.out.println("Sorting by DOB: ");
	               emp=s.sortEmployeeByDob();
	               emp.forEach(k->System.out.println(k));
	               break;
			
			case 8:System.out.println("Exit");
				   System.exit(0);
				   break;
			}
		}while(i<8);

	}

}
