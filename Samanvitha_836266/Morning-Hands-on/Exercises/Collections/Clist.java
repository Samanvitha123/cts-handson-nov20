package collections;

import java.util.ArrayList;
import java.util.List;

public class Clist {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(25);
		list.add(15);
		list.add(10);
		list.add(5);
		for(int i:list)
		{
			System.out.println("item: "+i);
		}
		System.out.println("Filtering even items: ");
		for(int i:list)
		{
			if(i%2==0)
			System.out.println("item: "+i);
			
		}
	}

}
