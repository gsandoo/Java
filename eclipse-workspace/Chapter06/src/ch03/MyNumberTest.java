package ch03;

public class MyNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber number =  (int x , int y)-> x > y ?x :y;
		
		System.out.println(number.getMax(30, 20));
	}

}
