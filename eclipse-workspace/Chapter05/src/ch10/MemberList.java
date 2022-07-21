package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberList {
	
	ArrayList<Member> arrayList = new ArrayList<>();
	
	public MemberList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberList(int size) {
		arrayList =new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
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
		
		// 이터레이터는 컬렉션에 포함된 요소를 하나 씩 읽을 수 있음
		Iterator<Member> ir = arrayList.iterator();
		
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberID();
			
			if(tempId == memberID) {
				arrayList.remove(member);
				return true;
			}
			
		}
		return false;
	}
	
	public void showNumber() {
		
		for(Member member : arrayList) {
			System.out.println(member);
		}
	}
}
