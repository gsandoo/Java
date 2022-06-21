package ch12;

public class OperatorTest {

	public static void main(String[] args) {
		int num10 = 10;
		int i = 2;
		
		boolean value = ((num10 = num10 + 10)<10)&&((i=i+2)<10);
		System.out.println(value); // false
		System.out.println(num10); // 20
		System.out.println(i); //2
		
		
		// 단락회로평가 :  and or 연산
		// 논리합은 false 가 먼저 나오면 뒷항은 연산x
		// 논리곱은 true 가 먼저 나오면 뒷항은 연산x
		
	}

}
