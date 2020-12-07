package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cmap {

	public static void main(String[] args) {
        Map<String,List<String>> map=new HashMap<>();
    	List<String> list1=new ArrayList<>();
    	list1.add("Student1");
    	list1.add("Student3");
   
		List<String> list2=new ArrayList<>();
		list2.add("Student2");
		list2.add("Student4");
		
		map.put("CSE",list1);
		map.put("EEE", list2);
		
		System.out.println("Single key multiple values: ");
		for(Map.Entry<String,List<String>> entry:map.entrySet())
		{
			String key=entry.getKey();
			List<String> values=entry.getValue();
			System.out.println(key+" "+values);
		}
       
  
	}

}
