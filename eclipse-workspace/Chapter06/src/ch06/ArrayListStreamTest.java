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
		
		
		//stream 은 자료의 대상과 관계없이 동일한 연산을 수행한다.
//					재사용은 불가하다.
				// 기존자료를 변경하지 않는다.
				// 중간연산과 최종연산으로 구별한다.
		Stream<String> stream = sList.stream();
		
		stream.forEach(s->System.out.println(s));
		
		System.out.println();
		
		sList.stream().filter(s->s.length()>8).forEach(s->System.out.println("8자리보다 큰 이름은 " + s));
		
		System.out.println();
		
		sList.stream().map(s->s.length()).forEach(s->System.out.print(s + "\t"));
	}

}
