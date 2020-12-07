package com.example.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.CustomerNotFoundException;
import com.example.exception.ResponseMessage;
import com.example.model.Customer;
import com.example.service.CustomerService;

@RequestMapping("customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer createCustomerAPI(@RequestBody Customer customer) {
		Customer createdCustomer = customerService.addCustomer(customer);
		return createdCustomer;
	}
	
	@GetMapping
	public ResponseEntity<Object> getAllCustomersAPI() {
    ResponseEntity<Object> response = null;
    try{
    	List<Customer> customer=customerService.fetchCustomers();
    	response=ResponseEntity.status(200).body(customer);
    }catch(CustomerNotFoundException e)
    {
    	ResponseMessage error=new ResponseMessage();
    	error.setStatusCode(404);
    	error.setDescription(e.getMessage());
    	response = ResponseEntity.status(404).body(error);
    }
    return response;
	}
	
	@GetMapping("{customerId}")
	public ResponseEntity<Object> getCustomerAPI(@PathVariable("customerId") int id) {
		ResponseEntity<Object> response = null;
		try {
			Customer customer = customerService.fetchCustomer(id);
			response = ResponseEntity.status(200).body(customer); // it has id, name, dob
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error); 
		}
		return response;
	}
	
	@GetMapping("delete/{customerId}")
	public ResponseEntity<Object> delCustomer(@PathVariable("customerId") int id)
	{
		ResponseEntity<Object> response=null;
		try {
			customerService.deleteCustomer(id);
			response=ResponseEntity.status(200).body("Deleted succesfully!");
		}catch(CustomerNotFoundException e)
		{
			ResponseMessage error= new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response=ResponseEntity.status(404).body(error);
		}
		return response;
	}
	
	@PutMapping("{customerId}/{dob}")
	public ResponseEntity<Object> updateCustomerDobAPI(@PathVariable("customerId") int id, @PathVariable("dob") String stringDob) {
		ResponseEntity<Object> response = null;
		try {
			Customer customer=customerService.updateCustomer(id, LocalDate.parse(stringDob));
			response = ResponseEntity.status(200).body(customer);
		} catch(CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error); 
		}
		return response;
		
	}
	
}

