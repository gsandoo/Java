package ch13;


import java.util.TreeSet;
import java.util.Iterator;


// 트리는 이진 트리 Binary search로 구현됨.
// 객체의 정렬에 사용되는 클래스.
// 이진검색트리에 저장되기 위해 비교를 해야함. (중요)
// 비교를 하는 코드를 짜는것이 트리를 구성하기 위한 첫번째단계.
// 비교 코드는 comparable 이나 comparator 를 사용하면 됌.

// 일반적으로 comparable 으로 구현하고 comparator는 comparable 로 구현 후 수정할 때 사용.

// String , Integer 등 JDK 의 많은 클래스들이 이미 comparable 을 구현했음.



public class MemberTreeSet {
	
	// TreeSet  생성 . 이진 트리
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
		
	}
	

	public void addMember(Member member) {
		treeSet.add(member);
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
		
		Iterator<Member> ir = treeSet.iterator();
		
		// hasNext는 다음요소가 있는지 확인하는 메서드. 커서는 배열 맨 앞에 있어서 첫 요소부터 읽음
		while (ir.hasNext()) {
			// 다음요소를 member 로 지정
			Member member = ir.next();
			int tempId = member.getMemberID();
			
			if(tempId == memberID) {
				treeSet.remove(member);
				return true;
			}
			
		}
		return false;
	}
	
	public void showNumber() {
		
		for(Member member : treeSet) {
			System.out.println(member);
		}
	}
}
