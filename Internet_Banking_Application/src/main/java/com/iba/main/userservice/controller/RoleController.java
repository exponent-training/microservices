package com.iba.main.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iba.main.userservice.service.RoleService;

@RestController
@RequestMapping(value = "/api/v1/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping(value = "/getAllRoles")
	public ResponseEntity<List<String>> getAllRole(){
		List<String> rlist = roleService.getRoleList();
		return ResponseEntity.ok(rlist);
	}

}
