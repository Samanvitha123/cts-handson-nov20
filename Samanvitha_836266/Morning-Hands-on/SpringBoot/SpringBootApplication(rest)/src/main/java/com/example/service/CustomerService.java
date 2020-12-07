package com.example.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerRepository;
import com.example.exception.CustomerNotFoundException;
import com.example.model.Customer;

@Service
public class CustomerService {

@Autowired	
private CustomerRepository dao; 	

	public Customer addCustomer(Customer customer) {
		Customer createdCustomer = dao.save(customer);
		return createdCustomer;
	}
	public List<Customer> fetchCustomers() throws CustomerNotFoundException{
		Optional<List<Customer>> option=Optional.of(dao.findAll());
		if(option.isEmpty())
			throw new CustomerNotFoundException("Sorry customer details are not available check db!");
	    else
	    	return option.get();
			
		
	}
	public Customer fetchCustomer(int id) throws CustomerNotFoundException {
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent()) 
			return option.get();
		else 
			throw new CustomerNotFoundException("Sorry customer with an id "+id+" not found");
	}
	public Customer updateCustomer(int id, LocalDate dob) throws CustomerNotFoundException {
		Customer customer = fetchCustomer(id);
		customer.setDob(dob);
		customer = dao.save(customer); 
		return customer;
	}
	public void deleteCustomer(int id)throws CustomerNotFoundException
	{
	Optional<Customer> option=dao.findById(id);
	   if(option.isPresent())
			dao.deleteById(id);
	   else
		   throw new CustomerNotFoundException("Sorry customer with id "+id+" not present");
	}
}