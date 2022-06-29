package ch13;

public class Subway {
	int subNum;
	int passengerCount;
	int money;
	
	public Subway(int subNum) {
		this.subNum = subNum;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
		
	}
	
	public void showSubwayInfo() {
		System.out.println(subNum + "번의 택시 승객 수는" + passengerCount + "명 이고 , 수입은" + money + " 원 입니다.");
	}
}