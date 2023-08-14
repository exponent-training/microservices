package com.iba.main.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iba.main.userservice.model.LoginResponse;
import com.iba.main.userservice.service.UserEntityService;

@RestController
@RequestMapping(value = "/api/v1")
public class LoginController {
	
	@Autowired
	private UserEntityService userEntityService;
	
	@PostMapping(value = "/login")
	public ResponseEntity<?> getLogin(@RequestParam String uname,@RequestParam String pass){
		System.out.println("Login Credentials : " + uname + "  " + pass);
		LoginResponse loginResponse = userEntityService.getLoginData(uname, pass);
	    if(ObjectUtils.isEmpty(loginResponse)) {
	    	return ResponseEntity.ok("Invalid Creadentials.");
	    }
		return ResponseEntity.ok(loginResponse);
	}

}
