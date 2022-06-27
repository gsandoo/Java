package ch09;

public class Practice {
	
	public int orderNumber;
	public int phoneNumber;
	public String address;
	public int time;
	public int price;
	public int menuNumber;
	public String name;
	
	public Practice(String name , int time ) {
		
		this.name = name; 
		System.out.println(name + " 의 주문표 입니다. " + time);
		
	}
	
	
	
	
}
