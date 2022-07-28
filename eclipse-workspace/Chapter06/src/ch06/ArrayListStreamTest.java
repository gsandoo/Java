package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomes");
		sList.add("Pirerre");
		sList.add("Alexandro");
		
		Stream<String> stream = sList.stream();
		
		stream.forEach(s->System.out.println(s));
		
		System.out.println();
		
		sList.stream().filter(s->s.length()>8).forEach(s->System.out.println("8자리보다 큰 이름은 " + s));
		
		System.out.println();
		
		sList.stream().map(s->s.length()).forEach(s->System.out.print(s + "\t"));
	}

}
