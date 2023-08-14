package com.iba.main.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginResponse {
	
	private String fname;
	
	private String lname;
	
	private String email;
	
	private String rolename;
	
	//private String status;
	

}
