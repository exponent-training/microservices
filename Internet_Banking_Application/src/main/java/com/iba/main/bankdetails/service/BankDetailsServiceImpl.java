package com.iba.main.bankdetails.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iba.main.bankdetails.repo.BankDetailsRepository;
import com.iba.main.userservice.model.BankDetails;

@Service
public class BankDetailsServiceImpl implements BankDetailsService{

	private static final Logger LOGGER = LogManager.getLogger(BankDetailsServiceImpl.class);
	
	@Autowired
	private BankDetailsRepository bankDetailsRepository;
	
	@Override
	public void saveBankDetailsInfo(BankDetails bankDetails) {
		// TODO Auto-generated method stub
		LOGGER.info("In Bank Details Service Start");
		BankDetails bankDetails2 = bankDetailsRepository.save(bankDetails);
		if(bankDetails2 != null) {
			LOGGER.debug("Bank Detail Successfully Stored.");
		}
		LOGGER.info("In Bank Details Service End");
	}

}
