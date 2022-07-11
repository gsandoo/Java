package ch15;

public interface Seller {

	
	void sell();
	
	default void order() {
		System.out.println("seller order");
	}
}
