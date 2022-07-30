package ch08;



//try catch 문을 사용하면 error 가 나도 계속 진행은된다..! (프로그램이 죽지않고)

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5};
		try {
		for(int i = 0 ; i <= 5 ; i++) {
			System.out.println(array[i]);
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			// 에러메시지 get
			System.out.println(e.getMessage());
			System.out.println(e);
		}	
		System.out.println("컨티뉴..!");
	}

}
