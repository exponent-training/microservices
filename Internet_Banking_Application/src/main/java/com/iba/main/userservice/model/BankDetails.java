package com.iba.main.userservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class BankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bid;
	
	private String bname;
	
	private String baddr;
	
	private String branchcode;
	
	private String ifsccode;
	
	private String micrcode;
	
	private String email;
	
	private String contactno;
	
	private int zipcode;
	
	private String faxno;
	
	
	
}
