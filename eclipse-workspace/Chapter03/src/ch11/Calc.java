package ch11;


// 추상 메서드로만 이루어진 인터페이스
public interface Calc {
	
	double PI = 3.14;
	int ERROR  = -99999999;
	
	public int add(int num1 , int num2);
	public int minus(int num1 , int num2);
	public int divide(int num1 , int num2);
	public int multiply(int num1 , int num2);
}
