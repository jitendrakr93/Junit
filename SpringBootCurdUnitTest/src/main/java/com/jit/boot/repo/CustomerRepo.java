package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
