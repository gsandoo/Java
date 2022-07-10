package ch14;


// 추상 메서드로만 이루어진 인터페이스
public interface Calc {
	
	double PI = 3.14;
	int ERROR  = -99999999;
	
	public int add(int num1 , int num2);
	public int minus(int num1 , int num2);
	public int divide(int num1 , int num2);
	public int multiply(int num1 , int num2);
	
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		
	}
	
	static int total(int[] array) {
		int total = 0;
		for(int num:array) {
			total +=num;
		}
		
		return total;
	}
	
	
	
}
