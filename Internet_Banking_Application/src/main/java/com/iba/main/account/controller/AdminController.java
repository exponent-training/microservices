package com.iba.main.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iba.main.userservice.service.AdminService;

@RestController
@RequestMapping(value = "/api/v1/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping(value = "/roleassign")
	public String assignedRole(@RequestParam String uname,@RequestParam String rolename) {
		System.out.println("Check Role Data : " + uname + "  " + rolename);
		adminService.assignedRoleToUser(uname, rolename);
		return "Role Assigned Successfully...!";
	}

}
