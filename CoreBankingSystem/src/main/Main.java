package main;

import java.util.Scanner;

import model.Branch;
import service.Usecase;
import store.BankBranchList;

public class Main {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m"; 
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	
	static Usecase use  = new Usecase();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
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
		    CustomerTask();
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
			
		 	System.out.println("1. Add Branch");
			System.out.println("2. Update Fees of Course");
			System.out.println("3. Delete Course");
			System.out.println("4. Search Course");
			System.out.println("5. Create Batch");
			System.out.println("6. Add Student in Batch");
			System.out.println("7. Update Seats in Batch");
			System.out.println("8. View Student in Batch");
			System.out.println("0. GO BACK");
			System.out.println("10. MAINMENU");
			System.out.println("9. EXIT");
			System.out.println(ANSI_BLUE+"ENTER YOUR OPTION ON NEXT LINE"+ANSI_RESET);
			
			Usecase ad= new Usecase();
			
			int rest = sc.nextInt();
			
			switch (rest) {
			  case 1:
			    ad.addBranch();
			    adminTask();
			    break;
			  case 2:
				
			    adminTask();
			    break;
			  case 3:
				
				adminTask();
				break;
			  case 4:
				
				adminTask();
				break;
			  case 5:
				
				adminTask();
				break;
			  case 6:
				
				adminTask();
				break;
			  case 7:
				
				adminTask();
				break;
			  case 8:
				
				adminTask();
				break;
			  case 0:
				
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
	
	public static void CustomerTask() {
		 
		 System.out.println(ANSI_RED +"PLEASE SELECT ONE OPTION" + ANSI_RESET);
		 System.out.println();
		 
		 System.out.println("1. Customer Registration ");
		 System.out.println("2. View Bank ");
		 System.out.println("3. View Branch ");
		 System.out.println("4. Add Account ");
		 System.out.println("0. GO BACK");
		 System.out.println("10. MAINMENU");
		 System.out.println("9. EXIT");
		 System.out.println(ANSI_BLUE+"ENTER YOUR OPTION ON NEXT LINE"+ANSI_RESET);
		 
		 Usecase us = new Usecase();
		 
		 int day = sc.nextInt();
			switch (day) {
			  case 1:
			   
			    break;
			  case 2:
				
				    break;  
			  case 3:
					us.viewBraches();
					CustomerTask();
					    break; 	
			  case 4:
				  us.addAccount();
				  CustomerTask();
					    break;
			  case 0:
			    mainMenu();
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
			    //adminAuthorizetion();
			}
	
	}

}
