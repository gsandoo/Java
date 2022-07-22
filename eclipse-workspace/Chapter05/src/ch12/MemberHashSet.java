package ch12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public MemberHashSet(int size) {
		hashSet =new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
//	for(int i =0 ; i< arrayList.size(); i++) {
//		
//		Member member = arrayList.get(i);
//		// 멤버타입 변수에 저장 . i 번째 요소
//		
//		int tempId = member.getMemberID();
//		
//		if(tempId == memberID) {
//			arrayList.remove(i);
//			return true;
//		}
//	}
//	return false;
		
		// 이터레이터는 컬렉션에 포함된 요소를 하나씩 순회하며 읽을 수 있음
		
		Iterator<Member> ir = hashSet.iterator();
		
		// hasNext는 다음요소가 있는지 확인하는 메서드. 커서는 배열 맨 앞에 있어서 첫 요소부터 읽음
		while (ir.hasNext()) {
			// 다음요소를 member 로 지정
			Member member = ir.next();
			int tempId = member.getMemberID();
			
			if(tempId == memberID) {
				hashSet.remove(member);
				return true;
			}
			
		}
		return false;
	}
	
	public void showNumber() {
		
		for(Member member : hashSet) {
			System.out.println(member);
		}
	}
}
