package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.SavingAccount;

@Repository
public class SavingRepoImpl implements SavingRepo {

	@Autowired
	EntityManager eMan;

	@Override
	public void addSavingAccount(SavingAccount Savings) {
		// TODO Auto-generated method stub
		eMan.persist(Savings);
		
	}

	@Override
	public List<SavingAccount> getSavings() {
		// TODO Auto-generated method stub
		Query qry=eMan.createQuery("from SavingAccount");
		return qry.getResultList();
	}
	
	@Override
	public boolean deleteSavingAccount(SavingAccount Savings) {
		SavingAccount ss=eMan.find(SavingAccount.class, Savings.getUser_id());
		eMan.remove(ss);
		return true;
	}
	@Override
	public boolean updateSavingAccount(SavingAccount Savings) {
		// TODO Auto-generated method stub
		eMan.merge(Savings);
		return true;
	}

	@Override
	public SavingAccount searchSavingAccountById(String user_id) {
		// TODO Auto-generated method stub
		 SavingAccount ss=eMan.find(SavingAccount.class, user_id);
		 return ss;
	}

	 
}
