package com.anz.mytest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "accounts")
public class Account {
	
	@SequenceGenerator(name="acctNumberGenerator", initialValue=1111111111, allocationSize=100)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="acctNumberGenerator")
	private Long acctNumber;

	private String customerId;
	
	private String name;
	private String type;
	private String currency;
	private Double balance;
	private String balanceDate; 
	
	/**
	 * @param id
	 * @param customerId
	 * @param name
	 * @param type
	 * @param currency
	 * @param balance
	 * @param balanceDate
	 * @param acctNumber
	 */
	public Account(String customerId, String name, String type, String currency, Double balance,
			String balanceDate, Long acctNumber) {
		super();
		
		this.customerId = customerId;
		this.name = name;
		this.type = type;
		this.currency = currency;
		this.balance = balance;
		this.balanceDate = balanceDate;
		this.acctNumber = acctNumber;
	}

	public String getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}

	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Long getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(Long acctNumber) {
		this.acctNumber = acctNumber;
	}

	

	public Account() {
		super();
	}

	public Account(String name, Double balance) {
		super();
		this.setName(name);
		this.setBalance(balance);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account{" + "id=" + acctNumber + ", name='" + name + '\'' + ", balance='" + balance + '\'' + '}';
	}
}
