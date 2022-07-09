package ch10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("운전자에 의해 자동차가 움직입니다.");
	}

	@Override
	public void stop() {
		System.out.println("운전자에 의해 차가 멈춥니다.");
	}

}
