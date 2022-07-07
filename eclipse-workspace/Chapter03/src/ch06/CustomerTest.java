package ch06;

import java.util.ArrayList;

import ch06.Customer;
import ch06.VIPCustomer;


	public class CustomerTest {

		public static void main(String[] args) {
//			Customer customerLee = new Customer(10010, "이순신");
////			customerLee.setCustomerName("이순신");
////			customerLee.setCustomerID(10010);
//			customerLee.bonusPoint = 1000;
//			System.out.println(customerLee.showCustomerInfo());
//				
//				
//			VIPCustomer customerKim = new VIPCustomer(10020 , "김유신");
////			customerKim.setCustomerName("김유신");
//			customerKim.setCustomerID(10020);
//			customerKim.bonusPoint = 10000;
//			System.out.println(customerKim.showCustomerInfo());
		
		
		Customer customerT = new Customer(10001, "Tomas");
		Customer customerK = new VIPCustomer(10002, "Keon");
		Customer customerG = new GoldCustomer(10003, "Gabriel");
		Customer customerJ = new GoldCustomer(10004, "Johnny");
		Customer customerL = new Customer(10005, "LaMelo");
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		customerList.add(customerT);
		customerList.add(customerK);
		customerList.add(customerG);
		customerList.add(customerJ);
		customerList.add(customerL);
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
		
		}
	}