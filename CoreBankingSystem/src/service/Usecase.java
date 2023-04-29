package service;

import java.util.Scanner;

import Exception.ExceptionHandlar;
import model.Account;
import model.Branch;
import store.AccountList;
import store.BankBranchList;

public class Usecase {
	
	private static BankBranchList branchList = new BankBranchList(5);
	
	private static AccountList accountlist = new AccountList(5);
	
	static Scanner sc = new Scanner(System.in);
	

	// BRACH SECTION //
	
	public static void addBranch() {
		
		System.out.println("Enter Branch Name");
		String branchName= sc.next();
		sc.nextLine();
		
		System.out.println("Enter Branch Address");
		String branchAddress = sc.next();
		sc.nextLine();
		
		if (branchAddress == null || branchName.isEmpty()) {
            throw new IllegalArgumentException("Details in mandatory");
        }else {
        	branchList.addBranch(new Branch(branchName, branchAddress));
    		
    		System.out.println("Branch Added Successfully");
        }
	}
	
	public static void viewBraches() {
		for(int j=0;j<branchList.getNumBranches();j++) {
			System.out.println("Brank name is "+branchList.getBranch(j).getBranchName()); 
			System.out.println("Brank address is "+branchList.getBranch(j).getBranchAddress());
			System.out.println("***********************");
		}
	}
	
	
	
	//ACCOUNT SECTION//
	
	public static void addAccount() {
		System.out.println("Add Account Details");
		System.out.println("Enter Account Type");
		String accountType = sc.next();
		
		System.out.println("Enter Account Number");
		Integer accountNumber = sc.nextInt();
		
		System.out.println("Enter Account Branch Address");
		String accountBranchAddress = sc.next();
		
		boolean flag = true;
		for(int i=0;i<branchList.getNumBranches();i++) {
			if(branchList.getBranch(i).getBranchAddress()  == accountBranchAddress) {
				try {
					accountlist.addAccount(new Account(accountType, accountNumber, accountBranchAddress));
				} catch (ExceptionHandlar e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flag= false;
			}else {
				if(flag) {
					System.out.println("This branch is not Available please select below branch");
					for(int j=0;j<branchList.getNumBranches();j++) {
						System.out.println("Brank name is "+branchList.getBranch(j).getBranchName()); 
						System.out.println("Brank address is "+branchList.getBranch(j).getBranchAddress());
						System.out.println("*******************");
					}
				}
			}
		}
	}
	
	
	
	

}
