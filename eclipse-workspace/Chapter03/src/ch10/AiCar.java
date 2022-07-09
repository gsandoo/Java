package ch10;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행을 시전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자율주행을 중단합니다.");
	}

}
