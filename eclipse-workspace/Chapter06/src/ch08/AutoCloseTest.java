package ch08;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoClosable obj = new AutoClosable();
		
		try(obj) {
			throw new Exception();//exception 던져주기
		} catch (Exception e) {
			System.out.println("handling...");
		}
		System.out.println("end...");
	}

}
