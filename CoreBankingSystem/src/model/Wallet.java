package model;

public class Wallet {
	
	private String customerName;
	private int accountNumber;
	private int balace;
	private String bankName;
	private String branchName;
	
	
	public Wallet(String customerName, int accountNumber, int balace, String bankName, String branchName) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balace = balace;
		this.bankName = bankName;
		this.branchName = branchName;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getBalace() {
		return balace;
	}


	public void setBalace(int balace) {
		this.balace = balace;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
	

}
