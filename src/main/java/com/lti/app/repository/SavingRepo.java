package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.SavingAccount;

public interface SavingRepo 
{
	public void addSavingAccount(SavingAccount Savings);
	public List<SavingAccount>getSavings();
	public boolean deleteSavingAccount(SavingAccount Savings);
	public boolean updateSavingAccount(SavingAccount Savings);
	public SavingAccount searchSavingAccountById(String user_id);

}
