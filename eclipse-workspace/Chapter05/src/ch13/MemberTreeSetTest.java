package ch13;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		// 이진트리 생성.
		MemberTreeSet memberList = new MemberTreeSet();
		
		
		Member memberKim = new Member(1000, "김미래");
		Member memberLee = new Member(1001, "이순신");
		Member memberSon = new Member(7, "손흥민");
		Member memberWang = new Member(1004, "왕오춘");
		
		// 이진트리에 요소 추가
		memberList.addMember(memberWang);
		memberList.addMember(memberLee);
		memberList.addMember(memberKim);
		memberList.addMember(memberSon);
		
	
		memberList.showNumber();
		
//		memberList.addMember(memberKim);
//		
//		memberList.showNumber();
	}

}
