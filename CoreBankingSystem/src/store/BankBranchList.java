package store;

import model.Branch;

public class BankBranchList {

	private Branch[] branches;
	   private int numBranches;

	   public BankBranchList(int size) {
	      this.branches = new Branch[size];
	      this.numBranches = 0;
	   }

	   public void addBranch(Branch branch) {
	      if (this.numBranches < this.branches.length) {
	         this.branches[this.numBranches] = branch;
	         this.numBranches++;
	      }
	   }

	   public void removeBranch(int index) {
	      if (index >= 0 && index < this.numBranches) {
	         for (int i = index; i < this.numBranches - 1; i++) {
	            this.branches[i] = this.branches[i+1];
	         }
	         this.numBranches--;
	      }
	   }

	   public Branch getBranch(int index) {
	      if (index >= 0 && index < this.numBranches) {
	         return this.branches[index];
	      }
	      return null;
	   }

	   public int getNumBranches() {
	      return this.numBranches;
	   }
}
