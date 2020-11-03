package com.anz.mytest.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anz.mytest.exception.ResourceNotFoundException;
import com.anz.mytest.model.Account;
import com.anz.mytest.model.Transaction;
import com.anz.mytest.repository.AccountRepository;
import com.anz.mytest.repository.TransactionsRepository;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private TransactionsRepository transactionsRepository;

	@GetMapping("/accounts/listall")
	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	@GetMapping("/accounts/{acctNumber}/transactions")
	public HashMap<String, Object> getAccountById(@PathVariable(value = "acctNumber") Long acctNumber) {
		HashMap<String, Object> output = new HashMap();
		
		Account acct = accountRepository.findById(acctNumber)
				.orElseThrow(() -> new ResourceNotFoundException("Account", "id", acctNumber));
		
		List<Transaction> transactions = transactionsRepository.findByAccountNumber(acctNumber);
		output.put("account", acct);
		output.put("transactions", transactions);
		return output;
	}
	
	
}
