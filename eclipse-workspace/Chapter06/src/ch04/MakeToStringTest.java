package ch04;

public class MakeToStringTest {

	public static void main(String[] args) {
		
		// 클래스로 구현 하기
		MakeToString string = new MakeToString();
		string.MakeString("IronMan,", "i love you 3000");

		
		// 람다식 구현 .. > 익명으로 클래스가 생성되어서 간편해보임
		StringConcat concat = (s,s1)->{System.out.println(s + " " + s1);};
		concat.MakeString("SpiderMan", "Come on Ya !");

		// 내부 익명 클래스
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void MakeString(String s1, String s2) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
