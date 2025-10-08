package com.tka.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true, nullable = false)
	private String accountNumber;
	
	@Column(nullable = false)
	private String accounHolderName;
	private double balance;
	
	@Column(nullable = false)
	private String accountType;
	
	@Column(nullable = false)
	private String createAt;
	
	@Column(nullable = false)
	private String branch;
	
	@Column(nullable = false)
	private String ifscCode;
	
	public BankAccount() {
		super();
		
	}
	public BankAccount(String accountNumber, String accounHolderName, double balance, String accountType,
			String createAt, String branch, String ifscCode) {
		super();
		this.accountNumber = accountNumber;
		this.accounHolderName = accounHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.createAt = createAt;
		this.branch = branch;
		this.ifscCode = ifscCode;
	}
	public BankAccount(int id, String accountNumber, String accounHolderName, double balance, String accountType,
			String createAt, String branch, String ifscCode) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accounHolderName = accounHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.createAt = createAt;
		this.branch = branch;
		this.ifscCode = ifscCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccounHolderName() {
		return accounHolderName;
	}
	public void setAccounHolderName(String accounHolderName) {
		this.accounHolderName = accounHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public void display() {
		System.out.println("Id: " + id );
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Account Type: "+ accountType);
		System.out.println("Create Account: "+ createAt);
		System.out.println("Branch: "+ branch);
		System.out.println("IFSC Code: "+ ifscCode);
	}
	
	
	
	
	

}
