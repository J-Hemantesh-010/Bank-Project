package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.services.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/{id}/account")
	void addAccount(@RequestBody @Valid AccountDetails account, @PathVariable("id") Integer id) {
		accountService.addAccount(account, id);
	}

}