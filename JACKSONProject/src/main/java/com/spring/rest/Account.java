package com.spring.rest;

public class Account {
	private long accountNumber;
	private float balance;
	private String branchName;
	private String bankName;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Account(long accountNumber, float balance, String branchName, String bankName) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.branchName = branchName;
		this.bankName = bankName;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", branchName=" + branchName
				+ ", bankName=" + bankName + "]";
	}
	
	

}
