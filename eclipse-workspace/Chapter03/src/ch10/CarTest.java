package ch10;

public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AiCar();
		aiCar.run();
		
		
		System.out.println("================");
		
		
		Car manualCar = new ManualCar();
		manualCar.run();
	}

}
