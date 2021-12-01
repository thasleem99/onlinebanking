package com.lti.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.SavingAccount;
import com.lti.app.service.SavingService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class MyRestController 
{
	@Autowired
	SavingService savingservice;
	
	@GetMapping("/savings")
	public List<SavingAccount> getSavings()
	{
		return savingservice.getSavings();
	}
	@PostMapping("/savings")
	public boolean addSavingAccount(@RequestBody SavingAccount Savings)
	{
		savingservice.addSavingAccount(Savings);
		return true;
	}
	
	@DeleteMapping("/savings/{user_id}")
	public boolean deleteproduct(@PathVariable(name="user_id") String user_id)
	{
    SavingAccount Savings=savingservice.searchSavingAccountById(user_id);
		return savingservice.deleteSavingAccount(Savings);
	}
	@PutMapping("/savings")
	public boolean updateSavingAccount(@RequestBody SavingAccount Savings)
	{
		return savingservice.updateSavingAccount(Savings);
	}
}
