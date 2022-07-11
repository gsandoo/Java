package ch14;

public class CalcTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		Calc calc  = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.minus(num1, num2));
		System.out.println(calc.multiply(num1, num2));
	
		
		// 재정의 된 description default
		calc.description();
		
		
		int[] arr = {1,2,3,4,5};
		
		
		// static 은 인스턴스 생성 안해도 바로 부를 수 있음.
		System.out.println(Calc.total(arr));
	
	}

}
