package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.services.BankService;

public class Controller {
	@Autowired
	BankService customerService;
	void addCustomer(@RequestBody Customer newCustomer)
	{
		customerService.createCustomer(newCustomer);
	}
}
