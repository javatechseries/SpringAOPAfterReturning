package com.explore.spring.aop.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.explore.spring.aop.Account;

@Aspect
@Component
public class LoggingAspect {
	
	@AfterReturning(pointcut="execution(* com.explore.spring.aop.dao.AccountDAO.findAllAccounts(..))",returning="result")
	public void afterReturningFindAllAccountsAdvice(JoinPoint theJoinPOint, List<Account> result) {
		
		String signature=  theJoinPOint.getSignature().toShortString();
		
		System.out.println("Method is ==> " +signature);
		
		System.out.println("Result is  : "+result);
		
		convertAccountNamesToUpperCase(result);
		
		System.out.println("Accounts after updating is : "+result);
	}
	
		
	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for(Account tempAccount:result) {
			
			String upperCaseName= tempAccount.getName().toUpperCase();
			
			tempAccount.setName(upperCaseName);
		}
		
	}

}
