package store;

import Exception.ExceptionHandlar;
import model.Wallet;

public class WalletList {
	
	private Wallet[] walletList;
	private int size;
	
	public  WalletList(int size) {
		this.walletList = new Wallet[size];
		this.size = 0;
	}
	
	
	public Wallet[] getWalletList() {
		return walletList;
	}



	public void setWalletList(Wallet[] walletList) {
		this.walletList = walletList;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public void addWallet(Wallet wallet) throws ExceptionHandlar{
        if (this.size < walletList.length) {
            walletList[size++] = wallet;
        } else {
            throw new ExceptionHandlar("Account capacity is full");
        }
    }

    public void deleteWallet(int accountNumber) throws ExceptionHandlar {
        for (int i = 0; i < size; i++) {
            if (walletList[i].getAccountNumber() == accountNumber) {
                walletList[i] = walletList[size-1];
                walletList[size-1] = null;
                size--;
                return;
            }
        }
        throw new ExceptionHandlar("Account not found with this accountNumber");
    }

}
