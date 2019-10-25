package com.explore.spring.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explore.spring.aop.dao.AccountDAO;


public class AOPAppAfterReturning {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountDAO accountDAO = ctxt.getBean( "accountDAO",AccountDAO.class);
		
		List<Account> theAccounts = accountDAO.findAllAccounts();
		
		System.out.println("Accounts List in AOPAppAfterReturning : "+theAccounts);
				
		ctxt.close();


	}

}
