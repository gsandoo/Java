package ch10;

import java.util.ArrayList;

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
	for(int i =0 ; i< arrayList.size(); i++) {
		
		Member member = arrayList.get(i);
		// 멤버타입 변수에 저장 . i 번째 요소
		
		int tempId = member.getMemberID();
		
		if(tempId == memberID) {
			arrayList.remove(i);
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
