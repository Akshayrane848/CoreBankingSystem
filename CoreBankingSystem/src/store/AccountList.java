package store;

import Exception.ExceptionHandlar;
import model.Account;

public class AccountList {
	
	private Account[] accountList;
    private int size;

    public AccountList(int capacity) {
        this.accountList = new Account[capacity];
        this.size = 0;
    }
    
    

    public Account[] getAccountList() {
		return accountList;
	}



	public void setAccountList(Account[] accountList) {
		this.accountList = accountList;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public void addAccount(Account account) throws ExceptionHandlar{
		 if (this.size < accountList.length) {
	            accountList[size++] = account;
	        } else {
	            throw new ExceptionHandlar("Account capacity is full");
	        }
    }

    public void deleteAccount(int accountNumber) throws ExceptionHandlar {
        for (int i = 0; i < size; i++) {
            if (accountList[i].getAccountNumber() == accountNumber) {
                accountList[i] = accountList[size-1];
                accountList[size-1] = null;
                size--;
                System.out.println("Account delete succefully Account Number "+ accountNumber);
                return;
            }
        }
        throw new ExceptionHandlar("Account not found with this accountNumber");
    }
    

    public void modifyAccountDetails(int accountNumber, String accountType) {
        for (int i = 0; i < size; i++) {
            if (accountList[i].getAccountNumber() == (accountNumber)) {
            	accountList[i].setAccountType(accountType);
                System.out.println("Account details modified successfully.");
                return;
            }
        }
        System.out.println("Account with account number " + accountNumber + " not found.");
    }


}
