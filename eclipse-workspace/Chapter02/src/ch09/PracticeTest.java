package ch09;

public class PracticeTest {

	public static void main(String[] args) {

		Practice lee = new Practice();
		lee.address ="강남구";
		lee.orderNumber= 1311;
		lee.phoneNumber=1312-1111;
		lee.name="김";
		lee.price= 20000;
		lee.time =5;
		lee.menuNumber= 333;
		lee.showPracticeInfo();
		
		Practice kim = new Practice(1321312 , 1043433827 , "신곡2동" , 3 , 21000 , 123 , "김강산"  );
		
		
	}

}
