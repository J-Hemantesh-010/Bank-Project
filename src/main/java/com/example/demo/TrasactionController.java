package com.example.demo;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DepositeRepo;
import com.example.demo.services.DepositService;

@RestController
public class TrasactionController {
	
	@Autowired
	private DepositService depositService;
	
	@PostMapping("/deposite")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void addDeposit(@RequestBody @Valid DepositeRepo deposit) {
		depositService.deposite(deposite);
	}

}