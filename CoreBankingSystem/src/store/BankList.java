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

    public void addAccount(Bank bank) throws ExceptionHandlar{
        if (this.size < bankList.length) {
        	bankList[size++] = bank;
        } else {
            throw new ExceptionHandlar("Bank capacity is full");
        }
    }

}
