package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.SavingAccount;

public interface SavingService {
	public void addSavingAccount(SavingAccount Savings);
	public List<SavingAccount>getSavings();
	public boolean deleteSavingAccount(SavingAccount Savings);
	public boolean updateSavingAccount(SavingAccount Savings);
	public SavingAccount searchSavingAccountById(String user_id);

}
