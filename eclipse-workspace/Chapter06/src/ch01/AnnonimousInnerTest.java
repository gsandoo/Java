package ch01;

class Outer2{
	
	int outNum = 10;
	static int sNum = 100;
	
	
	Runnable getRunnable(int i) {
		// 지역변수
		int num = 20;
		
//		class MyRunnable implements Runnable
		//원래는 위 처럼 하지만 줄여서 아래 처럼 익명으로 쓸 수 있다.
		//익명 내부 클래스
		return new Runnable(){
			
			// 로컬변수..?
			int localNum = 30;
			
			@Override
			public void run() {
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

			}
			 
//			return new Runnable();
		};
		
		
	}
	// 이렇게도 사용 가능하다.
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("hello Dagger1");
		}
	};
	
}


public class AnnonimousInnerTest {

	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		Runnable runner = outer2.getRunnable(100);
		runner.run();
		System.out.println();
		outer2.runner.run();
	}

}
