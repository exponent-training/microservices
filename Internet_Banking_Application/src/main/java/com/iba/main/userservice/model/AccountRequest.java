package com.iba.main.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class AccountRequest {
	
	private String accountnumber;
	
	private int acctype;
	
	private int accstatus;
	
	private String uname;
	
	private String bankname;
	
	private String bankcode;
	
	private double amount;
	

}
