package model;

public class Bank {
	
	private String bankName;
	private String bankaddress;
	private String bankRegistration;
	
	
	public Bank(String bankName, String bankaddress, String bankRegistration) {
		super();
		this.bankName = bankName;
		this.bankaddress = bankaddress;
		this.bankRegistration = bankRegistration;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBankaddress() {
		return bankaddress;
	}


	public void setBankaddress(String bankaddress) {
		this.bankaddress = bankaddress;
	}


	public String getBankRegistration() {
		return bankRegistration;
	}


	public void setBankRegistration(String bankRegistration) {
		this.bankRegistration = bankRegistration;
	}

}
