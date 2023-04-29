package model;

import java.sql.Time;

public class Transaction {
	
	private Time timestrap;
	private String customerName;
	private String bankname;
	private Integer accountNumber;
	private String senderBranch;
	private String receiverBranch;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Integer amount;
	
	
	public Transaction(Time timestrap, String senderBranch, String receiverBranch, Integer amount) {
		super();
		this.timestrap = timestrap;
		this.senderBranch = senderBranch;
		this.receiverBranch = receiverBranch;
		this.amount = amount;
	}


	public Time getTimestrap() {
		return timestrap;
	}


	public void setTimestrap(Time timestrap) {
		this.timestrap = timestrap;
	}


	public String getSenderBranch() {
		return senderBranch;
	}


	public void setSenderBranch(String senderBranch) {
		this.senderBranch = senderBranch;
	}


	public String getReceiverBranch() {
		return receiverBranch;
	}


	public void setReceiverBranch(String receiverBranch) {
		this.receiverBranch = receiverBranch;
	}


	public Integer getAmount() {
		return amount;
	}


	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
