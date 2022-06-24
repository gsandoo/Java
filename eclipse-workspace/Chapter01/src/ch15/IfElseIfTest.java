package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {

		int age =12;
		int charge ;
		
		if(age <8) {
		charge =1000;
		System.out.println("미 취학 아동입니다.");
	}
		else if(age <14) {
			charge =2000;
			System.out.println("초등학생 입니다.");
	}
		else if(age <20) {
			charge =3000;
			System.out.println("중고등학생 입니다.");
	}	
		else {System.out.println("하이");}	
	}
}
