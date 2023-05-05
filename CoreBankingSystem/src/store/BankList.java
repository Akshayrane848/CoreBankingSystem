package store;

import Exception.ExceptionHandlar;
import model.Bank;

public class BankList {
	
	private Bank[] bankList;
	private int size;
	
	public BankList(int size) {
		this.bankList = new Bank[size];
		this.size = 0;
	}
	
	public void addBank(Bank bank) throws ExceptionHandlar{
        if (this.size < bankList.length) {
            bankList[size++] = bank;
        } else {
            throw new ExceptionHandlar("Account capacity is full");
        }
    }

	public Bank[] getBankList() {
		return bankList;
	}

	public int getSize() {
		return size;
	}

	
	

}
