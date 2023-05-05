package model;

import java.time.LocalDateTime;

public class Transaction {
	
	private String senderName;
	private String recieverName;
	private int accountNumber;
	private int reciverAccountNumber;
	private String bankName;
	private String senderBranch;
	private String recieverBranch;
	private LocalDateTime dateTimestrap;
	private String transactionType;
	
	
	public Transaction(String senderName, String recieverName, int accountNumber, int recieverAccountNumber,String bankName,
			String senderBranch, String recieverBranch, LocalDateTime dateTimestrap,String transactionType) {
		super();
		this.senderName = senderName;
		this.recieverName = recieverName;
		this.accountNumber = accountNumber;
		this.reciverAccountNumber = recieverAccountNumber;
		this.bankName = bankName;
		this.senderBranch = senderBranch;
		this.recieverBranch = recieverBranch;
		this.dateTimestrap = dateTimestrap;
		this.transactionType = transactionType;
	}


	public String getSenderName() {
		return senderName;
	}


	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}


	public String getRecieverName() {
		return recieverName;
	}


	public void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	


	public int getReciverAccountNumber() {
		return reciverAccountNumber;
	}


	public void setReciverAccountNumber(int reciverAccountNumber) {
		this.reciverAccountNumber = reciverAccountNumber;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getSenderBranch() {
		return senderBranch;
	}


	public void setSenderBranch(String senderBranch) {
		this.senderBranch = senderBranch;
	}


	public String getRecieverBranch() {
		return recieverBranch;
	}


	public void setRecieverBranch(String recieverBranch) {
		this.recieverBranch = recieverBranch;
	}


	public LocalDateTime getDateTimestrap() {
		return dateTimestrap;
	}


	public void setDateTimestrap(LocalDateTime dateTimestrap) {
		this.dateTimestrap = dateTimestrap;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	

}
