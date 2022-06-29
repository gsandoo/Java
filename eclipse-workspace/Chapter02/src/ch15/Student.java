package ch15;

public class Student {

	
	String name; 
	int money ;
	
	public Student(String name, int money) {
		
		this.name = name;  // 이름이 뭔지
		this.money =money; // 얼마를 지금 소지하고 있는지
		
	}
	
	public void takeTaxi(Taxi taxi) {
		
		taxi.take(10000);
		this.money-=10000;

	}
	
	public void showInfo() {
		System.out.println(name + " 님의 남은 돈은 " + money + "원 입니다");
		
	}
}
