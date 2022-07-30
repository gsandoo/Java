package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("이순신" , 40 , 100);
		TravelCustomer customerKim = new TravelCustomer("김창식" , 19 , 100);
		TravelCustomer customerPark = new TravelCustomer("박병호" , 21 , 100);
		
		// arrayList 생성
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerPark);
		customerList.add(customerKim);
		customerList.add(customerLee);
		
		System.out.println("고객 명단을 출력하겠습니다.");
		customerList.stream().forEach(c->System.out.println(c));
	
		System.out.println();
		
		System.out.println("여행비용을 합산합니다.");
		System.out.println(customerList.stream().mapToInt(c->c.getPay()).sum());
	
		System.out.println();
		
		System.out.println("성인을 정렬하여 출력합니다.");
		
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(c->System.out.println(c));
	}

}
