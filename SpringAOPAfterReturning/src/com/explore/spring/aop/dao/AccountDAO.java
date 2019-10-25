package com.explore.spring.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.explore.spring.aop.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	
	public List<Account> findAllAccounts(){
		
		List<Account> accounts= new ArrayList<>();
		
		Account account1 = new Account("Naga","Silver");
		Account account2= new Account("John","Gold");
		Account account3= new Account("Sarah","Platimum");
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		return accounts;
	}
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass()+" : Adding an account \n");
	}
	
	public void removeAccount(Account account) {
		System.out.println(getClass()+" : Removing an account \n");
	}

	public String getName() {
		System.out.println(getClass() + " : in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " : in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " : in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " : in setServiceCode()");
		this.serviceCode = serviceCode;
	}

	
}
