package com.org;

public class AccountAlreadyExistException extends Exception {
	
	public AccountAlreadyExistException (String message)
	{
		super(message);
	}

}
