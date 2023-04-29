package model;

public class Account {
	
	private String accountType;
	private Integer accountNumber;
	private String  accountBranch;
	
	
	public Account(String accountType, Integer accountNumber, String accountBranch) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.accountBranch = accountBranch;
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


	public String getAccountBranch() {
		return accountBranch;
	}


	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

}
