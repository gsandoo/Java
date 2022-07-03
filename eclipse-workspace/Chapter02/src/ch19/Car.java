package ch19;

public class Car {
	
	private static int serialNum  =  10000;
	private int carNum;
	
	
	public void Car() {
		serialNum ++;
		carNum = serialNum;
		
	}
	
	public int getCarNum() {
		return carNum;
		
	}

}
