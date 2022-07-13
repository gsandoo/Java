package ch02;

public class StringTest {

	public static void main(String[] args) {

		
		String java = new String("java");
		String android = new String("android");
		
		
		// 이 해시 주소랑
		System.out.println(System.identityHashCode(java));
		
		java=java.concat(android);

		
		// 이 해시 주소는 다르다. 왜냐면 concat 시 새롭게 메모리에 잡히니까
		System.out.println(System.identityHashCode(java));
		
		
//		System.out.println(java);
		
	}

}
