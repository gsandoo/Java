package ch13;

public class Student {
	// 학생의 정보
	String name;
	int money;
	
	// 생성자 (일종의 틀. 여러 학생이 같은 틀을 쓰기위해)
	public Student(String name, int money) {
		
		this.name = name;
		this.money = money;

	}
	
	// 행위               // 버스 생성자
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		
	}
	// 행위
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
		
	}
	// 출력행위
	public void showInfo () {
		System.out.println(name + "의 남은 돈은" + money + " 원 입니다.");
	}
	
}
