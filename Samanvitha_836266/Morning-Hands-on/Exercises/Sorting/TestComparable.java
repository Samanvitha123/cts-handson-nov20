package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Items> list=new ArrayList<Items>();
		list.add(new Items(200,"Tv",45000));
		list.add(new Items(300,"Ac",25000));
		list.add(new Items(100,"Car",50000));
		list.add(new Items(50,"Laptop",40000));
		for(Items i:list)
		{
			System.out.println(i);
		}
		System.out.println("After Sorting");
		Collections.sort(list);
		for(Items i:list)
		{
			System.out.println(i);
		}

	}

}
