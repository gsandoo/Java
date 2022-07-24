package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		// 이진트리 생성.
		MemberHashMap memberHashMap = new MemberHashMap();
		
		
		Member memberKim = new Member(1000, "김미래");
		Member memberLee = new Member(1001, "이순신");
		Member memberSon = new Member(7, "손흥민");
		Member memberWang = new Member(1004, "왕오춘");
		
		// 이진트리에 요소 추가
		memberHashMap.addMember(memberWang);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberSon);
		memberHashMap.removeMember(7);
		
	
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMapp = new HashMap<Integer,String>();
		
		hashMapp.put(1001, "kim");
		hashMapp.put(1002, "lee");
		hashMapp.put(1003, "cho");
		hashMapp.put(1004, "park");
		
		hashMapp.remove(1001);
		
		System.out.println(hashMapp); 
		
//		memberList.addMember(memberKim);
//		
//		memberList.showNumber();
	}

}
