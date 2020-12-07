package com.org;

public class Account {
	private long accountNo;
	private String name;
	private long amount;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accountNo, String name, long amount) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.amount = amount;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + "]";
	}

}
