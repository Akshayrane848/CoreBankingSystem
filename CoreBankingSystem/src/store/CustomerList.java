package store;

import Exception.ExceptionHandlar;
import model.Customer;

public class CustomerList {
	
	private Customer[] customerList;
	private int size;
	
	public CustomerList(int size) {
		this.customerList = new Customer[size];
		this.size = 0;
	}
	
	public void addCustomer(Customer customer) throws ExceptionHandlar{
        if (this.size < customerList.length) {
            customerList[size++] = customer;
        } else {
            throw new ExceptionHandlar("Account capacity is full");
        }
    }

	public Customer[] getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Customer[] customerList) {
		this.customerList = customerList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

}
