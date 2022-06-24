package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2); // 둘중 하나라도 1 이면 1
		System.out.println(num1 & num2); // 둘중 하나라도 0 이면 0
		System.out.println(num1 ^ num2); 		
		System.out.println(~num1);
		
		
		System.out.println(num1 << 2); // 복사 값 
		System.out.println(num1); // 값이 안변함

		System.out.println(num1 <<= 2); // 변하게 하려면 이렇게 해줘야함
		System.out.println(num1); // 변함
		
		
		System.out.println(num1>>=1); // /2n
		System.out.println(num1);
		
	}

}
