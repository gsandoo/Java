package ch18;


// singleton pattern
public class SingletonCompany {
	
	// 유일한 하나의 객체라 private static
	private static SingletonCompany instance  = new SingletonCompany();
	
	private SingletonCompany() {
		
	}
	
	
	// 다른데서 사용가능
	public static SingletonCompany getInstance() {
		if(instance == null) {
			instance =new SingletonCompany();
		}
			return instance;
		
		
	}
}
