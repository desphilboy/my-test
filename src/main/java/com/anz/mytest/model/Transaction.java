package com.anz.mytest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
	@SequenceGenerator(name="transactionsNumberGenerator", initialValue=991111111, allocationSize=10)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="transactionsNumberGenerator")
	private Long id;


	private Long acctNumber;
	
	private String valueDate;
	private Double debitAmount;
	private Double creditAmount;
	private String debitCredit;
	private String narrative;
	 
	/**
	 * @param id
	 * @param acctId
	 * @param valueDate
	 * @param debitAmount
	 * @param creditAmount
	 * @param debitCredit
	 * @param narrative
	 */
	public Transaction(Long id, Long acctNumber, String valueDate, Double debitAmount, Double creditAmount,
			String debitCredit, String narrative) {
		super();
		this.id = id;
		this.acctNumber = acctNumber;
		this.valueDate = valueDate;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.debitCredit = debitCredit;
		this.narrative = narrative;
	}
	/**
	 * 
	 */
	
	public Transaction() {
		super();
	}
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", acctNumber=" + acctNumber + ", valueDate=" + valueDate + ", debitAmount="
				+ debitAmount + ", creditAmount=" + creditAmount + ", debitCredit=" + debitCredit + ", narrative="
				+ narrative + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAcctId() {
		return acctNumber;
	}
	public void setAcctId(Long acctId) {
		this.acctNumber = acctId;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public Double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(Double debitAmount) {
		this.debitAmount = debitAmount;
	}
	public Double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getDebitCredit() {
		return debitCredit;
	}
	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}
	public String getNarrative() {
		return narrative;
	}
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

}
