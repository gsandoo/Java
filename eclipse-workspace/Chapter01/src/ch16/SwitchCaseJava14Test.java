package ch16;

import java.util.Scanner;

public class SwitchCaseJava14Test {

	// switch case 의 java14 이후 버전 코드
	// 변수에 담아서 return 값을 받을 수 있다.
	// 반환값은 yield 를 사용하면 된다.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		
		int day = switch(month) {
		case 1 , 3 , 5 ,8 , 10 , 12 ->{
			yield 31;
		}
		case 2 ->{
			yield 28;
		}
		case 4 , 6, 7, 9 , 11->{
			yield 30;
		}
		default ->{
			System.out.println("존재하지 않는 달입니다.");
			yield -1;
		}
		};
		System.out.println(" 입력하신 " +  month + " 월의 총 일수 는 "+ day + " 일 입니다 ");
	};

}
