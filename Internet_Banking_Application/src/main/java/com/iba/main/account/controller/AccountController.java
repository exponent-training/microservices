package com.iba.main.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iba.main.userservice.model.AccountRequest;
import com.iba.main.userservice.service.AccountService;


@RestController
@RequestMapping(value = "/api/v1/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping(value = "/create")
	public String createAccount(@RequestBody AccountRequest accountRequest) {
		System.out.println("Account Data: " + accountRequest);
		accountService.createAccount(accountRequest);
		return "Account Created";
	}

}
