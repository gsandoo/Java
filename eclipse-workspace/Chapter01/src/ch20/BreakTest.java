package ch20;

public class BreakTest {

	public static void main(String[] args) {
		
		
		int num;
		int sum = 0;
		
		
		for(num =1 ; ;  num++ ) {
			sum += num ;
			if(sum >= 100) {
				break;
			}
		}
		
		System.out.println(num);
		System.out.println(sum);
	}

}
