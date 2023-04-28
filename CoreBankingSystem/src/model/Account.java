package model;

public class Account {
	
	private String accountType;
	private Integer accountNumber;
	private Branch  accountBranch;
	private double accountBalance;
	
	
	public Account(String accountType, Integer accountNumber, Branch accountBranch,double accountBalance) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.accountBranch = accountBranch;
		this.accountBalance = accountBalance;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public Integer getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}


	public Branch getAccountBranch() {
		return accountBranch;
	}


	public void setAccountBranch(Branch accountBranch) {
		this.accountBranch = accountBranch;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
