package com.example.exception;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException() {
		super("Customer Not Found");
	}
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}