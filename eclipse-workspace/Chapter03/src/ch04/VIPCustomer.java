package ch04;

import ch04.Customer;

public class VIPCustomer extends Customer {

	private double bonusRatio;
	private String agentID;
	private double salesRatio;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID , customerName);
		// super 는 상위클래스로부터 상속 받은 매개변수를 말한다. 적어줘야함
		bonusGrade = "VIP";
		bonusRatio = 0.1;
		salesRatio = 0.1;
	}
	
	
	
	
	@Override
	// 오버라이딩 (재정의 개념)
	// 오버라이딩이 필요한이유:
	// 상속받은 값을 활용하지만 특별히 부모클래스랑 다른값을 나타내어야할 때 메서드를 재정의 하는것이다.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price  -= (int)(price - salesRatio);
		return price;
	}

	
	



	public String getAgentID() {
		return agentID;
	}
}
