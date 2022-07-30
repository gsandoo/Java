package ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5};
		
		//System.out.println(intArr[0]);
		
		// 유틸에 있는 최상위 array Arrays 사용
		Arrays.stream(intArr).forEach(s->System.out.print(s + "\t"));
		
		int sum = Arrays.stream(intArr).sum();
		System.out.println(sum);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		int sumAdd = 0;
		
		for(Integer integers : intList) {
			sumAdd+=integers;
		}
		System.out.println(sumAdd);
	}

}
