package model;

public class Customer {
	
	private String accountHolderName;
	private String address;
	private String dependendDetails;
	private String aadhar;
	private String panCard;
	
	
	public Customer(String accountHolderName, String address, String dependendDetails, String aadhar, String panCard) {
		super();
		if (aadhar == null || aadhar.isEmpty()) {
            throw new IllegalArgumentException("Aadhar is Mandatory");
        }
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.dependendDetails = dependendDetails;
		this.aadhar = aadhar;
		this.panCard = panCard;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDependendDetails() {
		return dependendDetails;
	}


	public void setDependendDetails(String dependendDetails) {
		this.dependendDetails = dependendDetails;
	}


	public String getAadhar() {
		return aadhar;
	}


	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}


	public String getPanCard() {
		return panCard;
	}


	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

}
