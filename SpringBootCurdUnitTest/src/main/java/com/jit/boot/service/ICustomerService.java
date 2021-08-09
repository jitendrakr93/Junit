package com.jit.boot.service;

import com.jit.boot.model.Customer;

public interface ICustomerService {

	public Integer saveCustomer(Customer c);
	public Customer getOneCustomer(Integer id);
}
