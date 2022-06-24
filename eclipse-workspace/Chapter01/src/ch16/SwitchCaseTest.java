package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int month = scanner.nextInt();
		int day =0 ;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 9: case 11: 
			day =31;
			break;
//		...
//		...
//		...	
			default:
				System.out.println("존재 하지 않는 달입니다");
				day=-1;			
	}
		System.out.println("해당하는" + month +  " 월은 " + day + " 일 입니다" );
}
}