package collections;

import java.util.ArrayList;
import java.util.List;

public class Objlist {

	public static void main(String[] args) {
		
		List<Listuser> list=new ArrayList<>();
		list.add(new Listuser(123,"Saman","Saman123"));
		list.add(new Listuser(234,"Bhavya","Bhavya123"));
		list.add(new Listuser(345,"Sumathi","Sumath123"));
		list.add(new Listuser(456,"Pavani","Pavani123"));
		list.add(new Listuser(567,"Bindu","Bindu123"));
		System.out.println("Users with name more than 4 letters: ");
		for(Listuser a:list)
		{
			if(a.getName().length()>5)
			{
				System.out.println(a);;
			}
		}
		
		
		
	}

}
