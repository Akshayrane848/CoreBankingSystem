package store;

import Exception.ExceptionHandlar;
import model.Account;
import model.Transaction;

public class TransactioinList {
	
	private Transaction[] transactionList;
	private int size;
	
	public TransactioinList(int size) {
		this.transactionList = new Transaction[size];
		this.size = 0;
	}
	
	
	
	public Transaction[] getTransactionList() {
		return transactionList;
	}



	public void setTransactionList(Transaction[] transactionList) {
		this.transactionList = transactionList;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public void addTransation(Transaction transation) throws ExceptionHandlar{
		 if (this.size < transactionList.length) {
	            transactionList[size++] = transation;
	        } else {
	            throw new ExceptionHandlar("Account capacity is full");
	        }
   }
}
