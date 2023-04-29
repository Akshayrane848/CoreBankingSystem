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
                return;
            }
        }
        throw new ExceptionHandlar("Account not found with this accountNumber");
    }

    public Account findAccount(int accountNumber) throws ExceptionHandlar{
        for (int i = 0; i < size; i++) {
            if (accountList[i].getAccountNumber() == accountNumber) {
                return accountList[i];
            }
        }
        throw new ExceptionHandlar("Account not found with this accountNumber");
    }
    
    
    public void viewAllAccounts() {
    	for (int i = 0; i < size; i++) {
    		System.out.println("Account Number"+ accountList[i].getAccountNumber() + "Account Type"+ accountList[i].getAccountType());
    		System.out.println("***********************************");
    	}
    }

    public void modifyAccountDetails(String accountNumber, String accountType) throws ExceptionHandlar{
        for (int i = 0; i < size; i++) {
            if (accountList[i].getAccountNumber().equals(accountNumber)) {
            	accountList[i].setAccountType(accountType);
                System.out.println("Account details modified successfully.");
                return;
            }
        }
        throw new ExceptionHandlar("Account with account number " + accountNumber + " not found.");
    }


}
