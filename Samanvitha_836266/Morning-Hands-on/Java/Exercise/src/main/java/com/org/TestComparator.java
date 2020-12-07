package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String args[])
	{
		List<Items> list=new ArrayList<Items>();
		list.add(new Items(200,"TV",45000));
		list.add(new Items(100,"Mobile",20000));
		list.add(new Items(300,"Laptop",30000));
		
		System.out.println("Initial ordering");
		list.forEach(item->System.out.println(item));
		 System.out.println();
		
		System.out.println("Sorting by ID in Ascending order!..");
        Collections.sort(list,new Comparator<Items>(){
	    public int compare(Items i1,Items i2) {return i1.getId()-i2.getId();}});	
	    list.forEach(item->System.out.println(item));
	    System.out.println();
	    
	    System.out.println("Sorting by ID in Descending order!..");
        Collections.sort(list,new Comparator<Items>(){
	    public int compare(Items i1,Items i2) {return i2.getId()-i1.getId();}});	
	    list.forEach(item->System.out.println(item));
	    System.out.println();
		
		System.out.println("Sorting by names in Ascending order!..");
        Collections.sort(list,new Comparator<Items>(){
	    public int compare(Items i1,Items i2) {return i1.getName().compareTo(i2.getName());}});	
	    list.forEach(item->System.out.println(item));
	    System.out.println();
	    
	    System.out.println("Sorting by names in Descending order!..");
        Collections.sort(list,new Comparator<Items>(){
	    public int compare(Items i1,Items i2) {return i2.getName().compareTo(i1.getName());}});	
	    list.forEach(item->System.out.println(item));
	    System.out.println();
	    
	    System.out.println("Sorting by price in Ascending order!..");
        Collections.sort(list,new Comparator<Items>(){
	    public int compare(Items i1,Items i2) {return Double.compare(i1.getPrice(), i2.getPrice());}});	
	    list.forEach(item->System.out.println(item));
	    System.out.println();
	    
	    System.out.println("Sorting by price in Descending order!..");
        Collections.sort(list,new Comparator<Items>(){
	    public int compare(Items i1,Items i2) {return Double.compare(i2.getPrice(), i1.getPrice());}});	
	    list.forEach(item->System.out.println(item));
	    System.out.println();
	
	}
}
