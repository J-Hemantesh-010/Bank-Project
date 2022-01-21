package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BankRepos;
import com.example.demo.Customer;

@Service
public class BankService  {
	@Autowired
	BankRepos customerRepo;
	public void createCustomer(Customer newCustomer) {
		
		customerRepo.save(newCustomer);
	}

}
