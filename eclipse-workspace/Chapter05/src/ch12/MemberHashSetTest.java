package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		
		MemberHashSet memberList = new MemberHashSet();
		
		
		Member memberKim = new Member(1000, "김미래");
		Member memberLee = new Member(1001, "이순신");
		Member memberSon = new Member(7, "손흥민");
		Member memberWang = new Member(1004, "왕오춘");
		
		memberList.addMember(memberWang);
		memberList.addMember(memberLee);
		memberList.addMember(memberKim);
		memberList.addMember(memberSon);
		
	
		Member memberHong = new Member(1004 , "홍길동");
		
		memberList.addMember(memberHong);
		memberList.showNumber();
		
//		memberList.addMember(memberKim);
//		
//		memberList.showNumber();
	}

}
