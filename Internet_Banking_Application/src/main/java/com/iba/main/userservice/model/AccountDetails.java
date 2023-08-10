package com.iba.main.userservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.iba.main.userservice.enumdata.AccountStatus;
import com.iba.main.userservice.enumdata.AccountType;

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
public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String accountnumber;

	@Enumerated(EnumType.STRING)
	private AccountType acctype;

	@Enumerated(EnumType.STRING)
	private AccountStatus accstatus;
	
	private Double amount;

	private Double actualBalance;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@OneToOne(cascade = {CascadeType.DETACH})
	private BankDetails bankDetails;
	
	private String updatedby;
	
	private String createdby;
	
	private String createdDate;
	
	private String updatedDate;
	
	
}
