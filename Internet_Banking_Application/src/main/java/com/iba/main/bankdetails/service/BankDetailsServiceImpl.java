package com.iba.main.bankdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iba.main.bankdetails.repo.BankDetailsRepository;
import com.iba.main.userservice.model.BankDetails;

@Service
public class BankDetailsServiceImpl implements BankDetailsService{

	
	@Autowired
	private BankDetailsRepository bankDetailsRepository;
	
	@Override
	public void saveBankDetailsInfo(BankDetails bankDetails) {
		// TODO Auto-generated method stub
		bankDetailsRepository.save(bankDetails);
	}

}
