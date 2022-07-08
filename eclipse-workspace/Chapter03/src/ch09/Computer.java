package ch09;

public abstract class Computer {

	public abstract void display();
	public abstract void typing();
	
	
	public void systemOn() {
		System.out.println("Computer turn on");
	};
	public void systemOff() {
		System.out.println("Computer turn off");
	};
}
