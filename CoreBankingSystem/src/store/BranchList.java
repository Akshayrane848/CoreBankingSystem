package store;

import Exception.ExceptionHandlar;
import model.Branch;

public class BranchList {
	
	private Branch[] branchList;
	private int size;
	
	public BranchList(int size) {
		this.branchList = new Branch[size];
		this.size = 0;
	}
	
	public void addBranch(Branch branch) throws ExceptionHandlar{
        if (this.size < branchList.length) {
            branchList[size++] = branch;
        } else {
            throw new ExceptionHandlar("Account capacity is full");
        }
    }

	

	public Branch[] getBranchList() {
		return branchList;
	}

	public void setBranchList(Branch[] branchList) {
		this.branchList = branchList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

}
