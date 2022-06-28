package ch09;

public class Practice {
	
	public int orderNumber;
	public int phoneNumber;
	public String address;
	public int time;
	public int price;
	public int menuNumber;
	public String name;
	
	public Practice (){};
	
	public void showPracticeInfo() {
		System.out.println(name + " 의 주문표 입니다. 고객님의 전화번호는 " + phoneNumber + " 이고 주소는 " + address + " 입니다 . 주문번호는 " + orderNumber + " 이며 " + time + " 시에 " + price + " 원이 계좌에서 빠져나갔습니다. "   );
		
	}
	
	public Practice(int orderNumber , int phoneNumber , String address, int time , int price , int menuNumber , String name ) {
		
		this.name = name; 
		System.out.println(name + " 의 주문표 입니다. 고객님의 전화번호는 " + phoneNumber + " 이고 주소는 " + address + " 입니다 . 주문번호는 " + orderNumber + " 이며 " + time + " 시에 " + price + " 원이 계좌에서 빠져나갔습니다. "   );
		
	}
	
	
	
	
}
