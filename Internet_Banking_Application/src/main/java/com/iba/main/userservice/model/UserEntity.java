package com.iba.main.userservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.iba.main.userservice.enumdata.Status;

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
@Table(name = "user_entity")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	
	private String fname;
	
	private String mname;
	
	private String lname;
	
	private String mobnumber;
	
	private long aadharno;
	
	private String panno;
	
	private String email;
	
	private String uname;
	
	private String pass;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PermanentAddress permanentAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private TemparoryAddress temparoryAddress;

}
