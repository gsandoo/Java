package ch03;

import ch03.Customer;

public class VIPCustomer extends Customer {

	private double vipRatio;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID , customerName);
		bonusGrade = "VIP";
		vipRatio = 0.1;
	}
	
	
}
