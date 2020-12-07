package com.org;

import java.util.ArrayList;
import java.util.List;

public class TestList {

public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		list.add(new Student("Student1",123,"Student123"));
		list.add(new Student("Student2",234,"Student234"));
		list.add(new Student("Stu3",345,"Student345"));
		list.add(new Student("Student4",456,"Student456"));
		list.add(new Student("Stud5",567,"Student567"));
		
		System.out.println("Students with name more than 5 letters: ");
		System.out.println();
		for(Student s:list)
		{
			if(s.getName().length()>5)
			{
				System.out.println(s);;
			}
		}
		
		
		
	}
}
