package service;

import java.time.LocalDateTime;
import java.util.Scanner;

import Exception.ExceptionHandlar;
import model.Account;
import model.Bank;
import model.Branch;
import model.Customer;
import model.Transaction;
import model.Wallet;
import store.AccountList;
import store.BankList;
import store.BranchList;
import store.CustomerList;
import store.TransactioinList;
import store.WalletList;

public class CustomerUsecase {
	
	static Scanner sc = new Scanner(System.in);
	
	private static AccountList accountList = new AccountList(15);
	private static BankList bankList = new BankList(5);
	private static CustomerList customerList = new CustomerList(15);
	private static WalletList walletList = new WalletList(15);
	private static TransactioinList transactionList = new TransactioinList(50);
	private static BranchList branchList = new BranchList(15);
	
	public void addCustomEntry() {
		
		try {
			customerList.addCustomer(new Customer("Akshay", "Mumbai", "father", "2231", "T254D"));
			customerList.addCustomer(new Customer("Pratik", "Mumbra", "Mother", "2234", "D458F"));
			customerList.addCustomer(new Customer("Sagar", "Dombivali", "Brother", "4587", "Y524O"));
			customerList.addCustomer(new Customer("Omkar", "Mulund", "Sister", "9854", "F456U"));
			customerList.addCustomer(new Customer("Prasad", "Diva", "father", "5587", "R789A"));
		} catch (ExceptionHandlar e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bankList.addBank(new Bank("Icici", "Mumbai", "2013"));
			bankList.addBank(new Bank("Kotak", "Mulund", "2015"));
			bankList.addBank(new Bank("Maharastra", "Diva", "1987"));
		} catch (ExceptionHandlar e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			branchList.addBranch(new Branch("icici", "mumbai"));
			branchList.addBranch(new Branch("icici", "mumbra"));
			branchList.addBranch(new Branch("kotak", "mumbai"));
			branchList.addBranch(new Branch("maharastra", "mumbai"));
		} catch (ExceptionHandlar e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			walletList.addWallet(new Wallet("Akshay", 2231, 500, "Icici", "icici"));
		} catch (ExceptionHandlar e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void credit() {
		
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		
		boolean flag = true;
		
		for (int i=0; i<walletList.getSize();i++) {
			if(walletList.getWalletList()[i].getAccountNumber() == accountNumber) {
				walletList.getWalletList()[i].setBalace(walletList.getWalletList()[i].getBalace()+amount);
				Transaction transation = new Transaction(walletList.getWalletList()[i].getCustomerName(), 
						walletList.getWalletList()[i].getCustomerName(), 
						accountNumber,walletList.getWalletList()[i].getAccountNumber() ,walletList.getWalletList()[i].getBankName(), 
						walletList.getWalletList()[i].getBankName(), 
						walletList.getWalletList()[i].getBankName(), 
						LocalDateTime.now(),"credit");
				flag= false;
				try {
					transactionList.addTransation(transation);
				} catch (ExceptionHandlar e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("hellow "+ walletList.getWalletList()[i].getCustomerName());
				System.out.println("Your bank credited with amount "+ amount);
				System.out.println("Account Number "+ walletList.getWalletList()[i].getAccountNumber());
				System.out.println("Balance "+ walletList.getWalletList()[i].getBalace());
				System.out.println("Bank  Name "+ walletList.getWalletList()[i].getBankName());
				System.out.println("Branch Name "+ walletList.getWalletList()[i].getBranchName());
			}
		}
		if(flag) {
			System.out.println("Please Enter valid Account Number");
		}
	}
	
	
	public void debit() {
		
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		
		
		for (int i=0; i<walletList.getSize();i++) {
			if(walletList.getWalletList()[i].getAccountNumber() == accountNumber && walletList.getWalletList()[i].getBalace() > amount) {
				walletList.getWalletList()[i].setBalace(walletList.getWalletList()[i].getBalace()-amount);
				Transaction transation = new Transaction(walletList.getWalletList()[i].getCustomerName(), 
						walletList.getWalletList()[i].getCustomerName(), 
						accountNumber,walletList.getWalletList()[i].getAccountNumber() ,walletList.getWalletList()[i].getBankName(), 
						walletList.getWalletList()[i].getBankName(), 
						walletList.getWalletList()[i].getBankName(), 
						LocalDateTime.now(),"debit");
				try {
					transactionList.addTransation(transation);
				} catch (ExceptionHandlar e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("hellow "+ walletList.getWalletList()[i].getCustomerName());
				System.out.println("Your bank debited with amount "+ amount);
				System.out.println("Account Number "+ walletList.getWalletList()[i].getAccountNumber());
				System.out.println("Balance "+ walletList.getWalletList()[i].getBalace());
				System.out.println("Bank  Name "+ walletList.getWalletList()[i].getBankName());
				System.out.println("Branch Name "+ walletList.getWalletList()[i].getBranchName());
			}else {
				System.out.println("Please confirm your balance or account number");
			}
		}
	}
	
	
	
	public void addAccount() {
		System.out.println("Enter Customer Adhar Number");
		String adhar = sc.next();
		
		boolean flag = true;
		boolean check = true;
		for(int j=0; j<customerList.getSize(); j++) {
			if(customerList.getCustomerList()[j].getAadhar().equals(adhar)) {
				String customerName = customerList.getCustomerList()[j].getAccountHolderName();
				System.out.println("Enter Bank Name");
				String bankName = sc.next();
				for(int a=0; a<bankList.getSize(); a++) {
					if(bankList.getBankList()[a].getBankName().equals(bankName)) {
						System.out.println("Enter Account Details");
						System.out.println("Enter Account Branch");
						String branch = sc.next();
						System.out.println("Enter Account Number");
						int accountNumber = sc.nextInt();
						System.out.println("Enter Account Type");
						String accountType = sc.next();
						System.out.println("Enter opening Balance");
						int balance = sc.nextInt();
						for (int i=0; i<walletList.getSize();i++) {
							if(walletList.getWalletList()[i].getAccountNumber() == accountNumber) {
								check = false;
								System.out.println("Account is already created");
							}
						}
						if(flag) {
								try {
									accountList.addAccount(new Account(accountType, accountNumber, branch));
									walletList.addWallet(new Wallet(customerName, accountNumber, balance, bankName, branch));
									flag = false;
									System.out.println("Your Account Added successfully");
								} catch (ExceptionHandlar e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}
						
					}	
				}
			}
		}
		if(flag) {
			System.out.println("Enter valid adhar Number");
		}
	}
	
	public  void allAccountHolderwithBalance() {
		for (int i=0; i<walletList.getSize();i++) {
			System.out.println("hellow "+ walletList.getWalletList()[i].getCustomerName());
			System.out.println("Account Number "+ walletList.getWalletList()[i].getAccountNumber());
			System.out.println("Balance "+ walletList.getWalletList()[i].getBalace());
			System.out.println("Bank  Name "+ walletList.getWalletList()[i].getBankName());
			System.out.println("Branch Name "+ walletList.getWalletList()[i].getBranchName());
		}
	}
	
	public void customerBalanceGreater10000() {
		for (int i=0; i<walletList.getSize();i++) {
			if(walletList.getWalletList()[i].getBalace() > 10000) {
				System.out.println("Customer Name "+ walletList.getWalletList()[i].getCustomerName());
				System.out.println("Account Number "+ walletList.getWalletList()[i].getAccountNumber());
				System.out.println("Balance "+ walletList.getWalletList()[i].getBalace());
				System.out.println("Bank  Name "+ walletList.getWalletList()[i].getBankName());
				System.out.println("Branch Name "+ walletList.getWalletList()[i].getBranchName());
				System.out.println("***************************************************");
			}
		}
	}
	
	public void viewTransactions() {
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		for(int i=0; i<transactionList.getSize();i++) {
			if(transactionList.getTransactionList()[i].getAccountNumber() == accountNumber) {
				System.out.println("Sender Name " + transactionList.getTransactionList()[i].getSenderName());
				System.out.println("Reciever Name " + transactionList.getTransactionList()[i].getRecieverName());
				System.out.println("Account Number " + transactionList.getTransactionList()[i].getAccountNumber());
				System.out.println("Bank Name " + transactionList.getTransactionList()[i].getBankName());
				System.out.println("Sender Branch " + transactionList.getTransactionList()[i].getSenderBranch());
				System.out.println("Reciever Branch" + transactionList.getTransactionList()[i].getRecieverBranch());
				System.out.println("Date and Time " + transactionList.getTransactionList()[i].getDateTimestrap());
				System.out.println("Transaction Type "+ transactionList.getTransactionList()[i].getTransactionType());
				System.out.println("************************************");
			}
		}
	}
	
	public void modifyAccount() {
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter Account Type");
		String accountType = sc.next();
		
		try {
			accountList.modifyAccountDetails(accountNumber, accountType);
			System.out.println("Your Account Update Successfully");
		} catch (ExceptionHandlar e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void viewAccount() {
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		
		for (int i=0; i<walletList.getSize();i++) {
			if(walletList.getWalletList()[i].getAccountNumber() == accountNumber) {
				System.out.println("hellow "+ walletList.getWalletList()[i].getCustomerName());
				System.out.println("Account Number "+ walletList.getWalletList()[i].getAccountNumber());
				System.out.println("Balance "+ walletList.getWalletList()[i].getBalace());
				System.out.println("Bank  Name "+ walletList.getWalletList()[i].getBankName());
				System.out.println("Branch Name "+ walletList.getWalletList()[i].getBranchName());
			}
		}
	}
	
	public void fundTransfer() {
		System.out.println("Enter Your Account Number");
		int sAccountNumber = sc.nextInt();
		System.out.println("Enter Reciever Account Number");
		int rAccountNumber = sc.nextInt();
		
		int ac =0;
		String sendername = null;
		String senderBranch = null;
		String recievername = null;
		String recieverBranch = null;
		String senderBank = null;
		
		for (int i=0; i<walletList.getSize();i++) {
			if(walletList.getWalletList()[i].getAccountNumber() == sAccountNumber
					|| walletList.getWalletList()[i].getAccountNumber() == rAccountNumber ) {
				ac++;
			}
		}
		if(ac != 2) {
			System.out.println("Account Number Not Found");
		}else {
			System.out.println("Enter Amount");
			int amount = sc.nextInt();
			for (int i=0; i<walletList.getSize();i++) {
				if(walletList.getWalletList()[i].getAccountNumber() == sAccountNumber) {
					if(walletList.getWalletList()[i].getBalace() < amount) {
						System.out.println("insufficient Balance");
					}else {
						walletList.getWalletList()[i].setBalace(walletList.getWalletList()[i].getBalace()- amount);
						sendername = walletList.getWalletList()[i].getCustomerName();
						senderBranch = walletList.getWalletList()[i].getBranchName();
						senderBank = walletList.getWalletList()[i].getBankName();
					}
				}
			}
			for (int i=0; i<walletList.getSize();i++) {
				if(walletList.getWalletList()[i].getAccountNumber() == rAccountNumber) {
						walletList.getWalletList()[i].setBalace(walletList.getWalletList()[i].getBalace()+ amount);
						recievername = walletList.getWalletList()[i].getCustomerName();
						recieverBranch = walletList.getWalletList()[i].getBranchName();
				}
			}
			Transaction transaction = new Transaction(sendername, recievername, sAccountNumber,rAccountNumber, senderBank, senderBranch, 
					recieverBranch, LocalDateTime.now(), "fundTransfer");
			try {
				transactionList.addTransation(transaction);
			} catch (ExceptionHandlar e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void viewFundTransferSameBranch() {
		for(int i=0;i<transactionList.getSize(); i++) {
			if(transactionList.getTransactionList()[i].getSenderBranch() == transactionList.getTransactionList()[i].getRecieverBranch()) {
				System.out.println("Sender Name " + transactionList.getTransactionList()[i].getSenderName());
				System.out.println("Reciever Name " + transactionList.getTransactionList()[i].getRecieverName());
				System.out.println("Account Number " + transactionList.getTransactionList()[i].getAccountNumber());
				System.out.println("Bank Name " + transactionList.getTransactionList()[i].getBankName());
				System.out.println("Sender Branch " + transactionList.getTransactionList()[i].getSenderBranch());
				System.out.println("Reciever Branch" + transactionList.getTransactionList()[i].getRecieverBranch());
				System.out.println("Date and Time " + transactionList.getTransactionList()[i].getDateTimestrap());
				System.out.println("Transaction Type "+ transactionList.getTransactionList()[i].getTransactionType());
				System.out.println("************************************");
			}
		}
	}
	
	public void viewFundTransferDiffBranch() {
		for(int i=0;i<transactionList.getSize(); i++) {
			if(transactionList.getTransactionList()[i].getSenderBranch() != transactionList.getTransactionList()[i].getRecieverBranch()) {
				System.out.println("Sender Name " + transactionList.getTransactionList()[i].getSenderName());
				System.out.println("Reciever Name " + transactionList.getTransactionList()[i].getRecieverName());
				System.out.println("Account Number " + transactionList.getTransactionList()[i].getAccountNumber());
				System.out.println("Bank Name " + transactionList.getTransactionList()[i].getBankName());
				System.out.println("Sender Branch " + transactionList.getTransactionList()[i].getSenderBranch());
				System.out.println("Reciever Branch" + transactionList.getTransactionList()[i].getRecieverBranch());
				System.out.println("Date and Time " + transactionList.getTransactionList()[i].getDateTimestrap());
				System.out.println("Transaction Type "+ transactionList.getTransactionList()[i].getTransactionType());
				System.out.println("************************************");
			}
		}
	}
	
	public void deleteAccount() {
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		try {
			accountList.deleteAccount(accountNumber);
			for (int i=0; i<walletList.getSize();i++) {
				if(walletList.getWalletList()[i].getAccountNumber() == accountNumber) {
					walletList.getWalletList()[i] = walletList.getWalletList()[walletList.getSize()-1];
					walletList.getWalletList()[walletList.getSize()-1] = null;
				}
			}
		} catch (ExceptionHandlar e) {
			e.printStackTrace();
		}
	}
}
