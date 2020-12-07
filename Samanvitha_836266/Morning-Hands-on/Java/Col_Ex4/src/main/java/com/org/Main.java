package com.org;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Account acc=new Account();
		Service service = new Service();
		Scanner sc=new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();
		int op;
		do {
			System.out.println("1.Add\n2.Remove Account by AccNum\n3.Display Account by AccNum\n4.Display all Accounts\n5.Display Account with balance<1000\n6.Exit");
			System.out.println("Select an option:");
			op= sc.nextInt();
		switch(op)
		{
		case 1: long num=0;
		 System.out.println("Enter AccountNo: ");
		  num=sc.nextLong();
		  try {
			 service.validateAcc(num);
		      }
		  catch(Exception al){
			  System.out.println(al);
			  break;
		  }
	      System.out.println("Enter Name: ");
	      String name=sc.next();
	      System.out.println("Enter Amount: ");
	      long amount =sc.nextLong();
	      Account ac=new Account(num,name,amount);
	      service.addAccount(ac);
	      break;
	    
		case 2: System.out.println("Enter AccNo. to delete: ");
		        long no=sc.nextInt();
		        try {
		        	service.isExist(no);
		        }
		        catch(Exception e) {
		        	System.out.println(e);
		        	return ;
		            }
		        service.deleteAcc(no);
		        break;
		case 3: System.out.println("Enter AccNo. to display: ");
		        long num1=sc.nextInt();
		        try {
		        	service.isExist(num1);
		        }
		        catch(Exception e){ 
		        	System.out.println(e);
		        	return ;
		        	}
		        Account b=service.fetchByAccNo(num1);
		        System.out.println("Account Details--> Name "+b.getName()+" Balance "+b.getAmount());
		        break;
		case 4: List<Account> d=service.getAccounts();
		       System.out.println(d);
		       break;
		case 5:System.out.println("Account having balance less than 1000");
		       List<Account> c=service.balance();
		       System.out.println(c);
		       break;
		 
		case 6:System.out.println("Exiting from menu....... ");
		       System.exit(0); 
		       break; 
		}

	     }while(op <= 6);
  
   }
}