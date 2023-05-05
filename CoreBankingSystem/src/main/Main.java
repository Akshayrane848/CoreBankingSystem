package main;

import java.util.Scanner;

import Exception.ExceptionHandlar;
import model.Bank;
import model.Branch;
import model.Customer;
import service.CustomerUsecase;
import store.BankList;
import store.BranchList;
import store.CustomerList;

public class Main {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m"; 
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	
	static Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		CustomerUsecase us= new CustomerUsecase();
		us.addCustomEntry();
		mainMenu();
	}
	
	public static void mainMenu() {            
		System.out.println(ANSI_RED +"PLEASE SELECT ONE OPTION" + ANSI_RESET);
		System.out.println();
		System.out.println("1. ADMIN");
		System.out.println("2. CUSTOMER");
		System.out.println("9. EXIT");
		System.out.println(ANSI_BLUE+"ENTER YOUR OPTION ON NEXT LINE"+ANSI_RESET);
		
		int rest = sc.nextInt();
		
		switch (rest) {
		  case 1:
		    System.out.println(ANSI_GREEN+"======WECOME TO ADMIN SECTION======"+ ANSI_RESET);
		    System.out.println(); 
		    adminTask();
		    break;
		  case 2:
		    System.out.println(ANSI_GREEN+"======WELCOME TO CUSTOMER SECTION======"+ ANSI_RESET);
		    System.out.println();
		    Customer();
		    break;
		  case 9:
		    System.out.println(ANSI_GREEN+"======THANK YOU======"+ ANSI_RESET);
		    System.out.println(ANSI_GREEN+"======WELCOME======"+ ANSI_RESET);
		    break;
		  default:
			  System.out.println(ANSI_RED +"INVALID SELECTION PLEASE SELECT RIGHT ONE" + ANSI_RESET);
			  mainMenu();
		}
	}
	
	public static void adminTask() {
		 
		 System.out.println(ANSI_RED +"PLEASE SELECT ONE OPTION" + ANSI_RESET);
		 System.out.println();
			
		 	System.out.println("1. DISPLAY ALL THE ACCOUNT HOLDER WITH BALANCE");
			System.out.println("2. DISPLAY ALL DEPENDENT DETAILS.");
			System.out.println("3. ALL THE CUSTOMERS WHO HAVE BALANCE GREATER THAN 10000 ");
			System.out.println("4. FUND TRANSFER BETWEEN ACCOUNT SAME BRANCH ");
			System.out.println("5. FUND TRANSFER BETWEEN ACCOUNT DIFFERENT BRANCH ");
			System.out.println("0. GO BACK");
			System.out.println("10. MAINMENU");
			System.out.println("9. EXIT");
			System.out.println(ANSI_BLUE+"ENTER YOUR OPTION ON NEXT LINE"+ANSI_RESET);
			
			CustomerUsecase us= new CustomerUsecase();
			
			
			int rest = sc.nextInt();
			
			switch (rest) {
			  case 1:
			    us.allAccountHolderwithBalance();
			    adminTask();
			    break;
			  case 2:
				 
				
			    break;
			  case 3:
				us.customerBalanceGreater10000();
				adminTask();
				break;
			  case 4:
				us.viewFundTransferSameBranch();
				adminTask();
				break;
			  case 5:
				us.viewFundTransferDiffBranch();
				adminTask();
				break;
			  case 0:
				  adminTask();
			    break;
			  case 10:
				mainMenu();
				break;
			  case 9:
			    System.out.println(ANSI_GREEN+"======THANK YOU======"+ ANSI_RESET);
			    System.out.println(ANSI_GREEN+"======WELCOME======"+ ANSI_RESET);
			    break;
			  default:
				  System.out.println(ANSI_RED +"INVALID SELECTION PLEASE SELECT RIGHT ONE" + ANSI_RESET);
				  adminTask();
			}
			
	 }
	
	public static void Customer() {
		 
	 	System.out.println(ANSI_RED +"PLEASE SELECT ONE OPTION" + ANSI_RESET);
		System.out.println();
		
		System.out.println("1. CREDIT BANK");
		System.out.println("2. DEBIT BANK");
		System.out.println("7. FUND TRANSFER");
		System.out.println("3. CREATE ACCOUN");
		System.out.println("4. MODIFY ACCOUNT");
		System.out.println("5. VIEW ACCOUNT DETAILS");
		System.out.println("6. TRANSACTION DATE WISE SUMMARY ");
		System.out.println("0. GO BACK");
		System.out.println("10. MAINMENU");
		System.out.println("9. EXIT");
		System.out.println(ANSI_BLUE+"ENTER YOUR OPTION ON NEXT LINE"+ANSI_RESET);
		
		CustomerUsecase us= new CustomerUsecase();
		
		int day = sc.nextInt();
		switch (day) {
		  case 1:
		    us.credit();
		    Customer();
		    break;
		  case 2:
		    us.debit();
		    Customer();
		    break;
		  case 7:
			    us.fundTransfer();
			    Customer();
			    break;
		  case 3:
			us.addAccount();
			Customer();
			break;
		  case 4:
				us.modifyAccount();
				Customer();
				break;
		  case 5:
				us.viewAccount();
				Customer();
				break;
		  case 6:
				us.viewTransactions();
				Customer();
				break;
		  case 0:
			  Customer();
		    break;
		  case 10:
			mainMenu();
			break;
		  case 9:
			System.out.println(ANSI_GREEN+"======THANK YOU======"+ ANSI_RESET);
			System.out.println(ANSI_GREEN+"======WELCOME======"+ ANSI_RESET);
			break;
		  default:
			System.out.println(ANSI_RED +"INVALID SELECTION PLEASE SELECT RIGHT ONE" + ANSI_RESET);
		    mainMenu();
		}
		
 }
	
	

}
