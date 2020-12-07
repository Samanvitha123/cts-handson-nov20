package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<String,List<Student>> map=new HashMap<>();
		List<Student> list1=new ArrayList<Student>();
        list1.add(new Student("Student1",123,"Student123"));
        list1.add(new Student("Student3",234,"Student234"));
        
        List<Student> list2=new ArrayList<Student>();
        list2.add(new Student("Student2",345,"Student345"));
        list2.add(new Student("Student4",456,"Student456"));
        
        map.put("CSE", list1);
        map.put("ECE", list2);
        
        System.out.println("Single key,Multiple values");
        for(Map.Entry<String, List<Student>> entry:map.entrySet())
        {
        	String key=entry.getKey();
        	List<Student> values=entry.getValue();
        	System.out.println(key+" "+values);
        }
        
	}

}
