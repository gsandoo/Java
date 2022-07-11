package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
//		
//		customer.buy();
//		customer.sell();
//		
//		customer.order();
		
		
		Buyer buyer =  customer;
		
		
		// 재정의를 customer 에서 해서 재정의된 메서드 호출
		buyer.buy();
		buyer.order();
		
	}

}
