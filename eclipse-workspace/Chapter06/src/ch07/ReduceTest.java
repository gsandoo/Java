package ch07;

import java.util.Arrays;
import java.util.function.BinaryOperator;

 class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length > s2.getBytes().length) {
			return s1;
		}else {
			return s2;
		}
	}
	
}


public class ReduceTest {

	public static void main(String[] args) {
		
		String[]greet = {"hi" , "안녕하세요~" , "hello" ,"안녕하세요우어"};
		
		System.out.println(Arrays.stream(greet).reduce("",
				(s1,s2)->{
				if(s1.getBytes().length > s2.getBytes().length) {
					return s1;
				}else {
					return s2;
				}}));
		
		
		String string = Arrays.stream(greet).reduce(new CompareString()).get();
		System.out.println(string);
	}

}
