package ch02;

public class LamddaTest {

	public static void main(String[] args) {
		
		Add addL = (x,y)->{return x+y;};
		
		System.out.println(addL.add(2, 7));

	}

}
