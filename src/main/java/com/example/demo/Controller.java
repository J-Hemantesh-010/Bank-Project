package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.BankService;

@RestController
public class Controller {
	@Autowired
	BankService customerService;
	@PostMapping("/newCustomer")
	void addCustomer(@RequestBody Customer newCustomer)
	{
		customerService.createCustomer(newCustomer);
	}
}
