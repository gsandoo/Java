package ch15;

public class Customer implements Buyer , Seller {

	@Override
	public void sell() {
		System.out.println("Customer sell");
	}

	@Override
	public void buy() {
		System.out.println("CUSTOMER BUY...");
	}

	
	// seller buyer 둘다 default order 라 재정의 필요
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("내가 오더 하지" );
	}

	
	
	

}
