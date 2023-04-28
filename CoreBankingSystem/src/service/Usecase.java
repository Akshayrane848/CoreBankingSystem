package service;

import java.util.Scanner;

import model.Branch;
import store.BankBranchList;

public class Usecase {
	
	private static BankBranchList branch = new BankBranchList(5);
	
	static Scanner sc = new Scanner(System.in);
	
	public static void addBranch() {
		
		System.out.println("Enter Branch Name");
		String branchName= sc.next();
		
		System.out.println("Enter Branch Address");
		String branchAddress = sc.next();
		
		
		if (branchAddress == null || branchName.isEmpty()) {
            throw new IllegalArgumentException("Aadhar is Mandatory");
        }
		
		branch.addBranch(new Branch(branchName, branchAddress));
		
		System.out.println("Branch Added Successfully");
	
	}
	
	

}
