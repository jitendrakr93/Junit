package com.jit.boot.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.boot.model.Customer;
import com.jit.boot.repo.CustomerRepo;
import com.jit.boot.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private CustomerRepo repo;
	

	public Integer saveCustomer(Customer c) {
		return repo.save(c).getCid();
	}

	public Customer getOneCustomer(Integer id) {
		Optional<Customer> opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}
