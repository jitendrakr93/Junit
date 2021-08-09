package com.jit.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jit.boot.model.Customer;
import com.jit.boot.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	@Autowired
	private ICustomerService service;


	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(
			@RequestBody Customer cust) 
	{
		ResponseEntity<String> resp=null;
		try {
			Integer id=service.saveCustomer(cust);
			resp=new ResponseEntity<String>("saved with:"+id, HttpStatus.OK);
		} catch (Exception e) {
			resp=new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
	
	@GetMapping("/view/{id}")
	public ResponseEntity<Customer> getOneCustomer(
			@PathVariable Integer id)
	{
		ResponseEntity<Customer> resp=null;
		
		Customer cust=service.getOneCustomer(id);
		if(cust==null) {
			resp=new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
		}else {
			resp=new ResponseEntity<Customer>(cust, HttpStatus.OK);
		}
		return resp;
	}

}
