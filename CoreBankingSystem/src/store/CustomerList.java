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

    public void addAccount(Customer customer) throws ExceptionHandlar{
        if (this.size < customerList.length) {
        	customerList[size++] = customer;
        } else {
            throw new ExceptionHandlar("Bank capacity is full");
        }
    }

}
