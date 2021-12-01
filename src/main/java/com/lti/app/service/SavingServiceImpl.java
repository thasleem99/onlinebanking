package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.app.pojo.SavingAccount;
import com.lti.app.repository.SavingRepo;

@Service
@Transactional
public class SavingServiceImpl implements SavingService {
	
	@Autowired
	SavingRepo sRepo;

	@Override
	public void addSavingAccount(SavingAccount Savings) {
		// TODO Auto-generated method stub
		sRepo.addSavingAccount(Savings);
		
	}

	@Override
	public List<SavingAccount> getSavings() {
		// TODO Auto-generated method stub
		return sRepo.getSavings();
	}
	
	 @Override
	    public boolean deleteSavingAccount(SavingAccount Savings) {
		return sRepo.deleteSavingAccount(Savings);
	 }

	@Override
	public boolean updateSavingAccount(SavingAccount Savings) {
		// TODO Auto-generated method stub
		return  sRepo.updateSavingAccount(Savings);
	}

	@Override
	public SavingAccount searchSavingAccountById(String user_id) {
		// TODO Auto-generated method stub
		return sRepo.searchSavingAccountById(user_id);
	}

}
