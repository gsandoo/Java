package ch10;

public abstract class Car {

	
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		
		System.out.println("자동차가 시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("자동차가 시동을 끕니다.");
	}
	
	
	// 템플릿 메서드
	final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
