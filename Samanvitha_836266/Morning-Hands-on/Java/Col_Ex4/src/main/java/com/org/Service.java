package com.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
	List<Account> acclist=new ArrayList<Account>();
	
	public void addAccount(Account account)
	{
		acclist.add(account);
		
	}
	public Account fetchByAccNo(Long accno)
	{
		for(Account ac:acclist)
		{
			if(ac.getAccountNo()==accno)
			
				return ac;
			
		}
		return null;
	}
	
	public void deleteAcc(Long accno)
	{	Iterator<Account> itr = acclist.iterator();
		while(itr.hasNext())
		{
			Account account=itr.next();
			if(account.getAccountNo()==accno)
			{
				itr.remove();
			}
		}
		System.out.println("Deleted..");
	}
	public void validateAcc(long accNo) throws AccountAlreadyExistException
	{
		for(Account a:acclist)
		{
			if(a.getAccountNo()==accNo)
				throw new AccountAlreadyExistException("Account already exists!");
		}
	}
 
	public void isExist(long accNo) throws AccountNotFoundException
	{
		for(Account a:acclist)
		{
			if((a.getAccountNo())!=accNo)
				throw new AccountNotFoundException("Account is not present");
		}
	}
	
	public List<Account> getAccounts()
	{
		return acclist;
	}
	
	public List<Account> balance()
	{
		return acclist.stream().filter(e->e.getAmount()<1000).collect(Collectors.toList());
	}

}
