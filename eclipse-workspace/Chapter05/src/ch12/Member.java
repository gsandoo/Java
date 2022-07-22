package ch12;

public class Member {
	
	private int memberID;
	private String memberName;
	
	public  Member(int memberID , String memberName){
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberID;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member ) {
			return true;
		}
		else {
			 return false;
		}
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberID + " 입니다.";
	}
	
}
