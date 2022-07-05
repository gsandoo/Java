package ch02;

public class Customer {

	protected String customerName;
	protected int customerID;
	protected String bonusGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		bonusGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String showCustomerInfo() {	
		return customerName + " 의 등급은 "+ bonusGrade + " 이며 보너스 포인트는 " + bonusPoint +  " 입니다. ";
	}
	
	
}
