package ch10;

public class MemberListTest {

	public static void main(String[] args) {
		
		
		MemberList memberList = new MemberList();
		
		
		Member memberKim = new Member(1000, "김미래");
		Member memberLee = new Member(1001, "이순신");
		Member memberSon = new Member(7, "손흥민");
		Member memberWang = new Member(1004, "왕오춘");
		
		memberList.addMember(memberWang);
		memberList.addMember(memberLee);
		memberList.addMember(memberKim);
		memberList.addMember(memberSon);
		
		memberList.showNumber();
		
		memberList.removeMember(memberKim.getMemberID());
		
		memberList.showNumber();
		
		memberList.addMember(memberKim);
		
		memberList.showNumber();
	}

}
