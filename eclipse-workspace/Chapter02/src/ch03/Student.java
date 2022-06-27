package ch03;

public class Student {
	
	public int studentId;
	public String address;
	public String studentName ;
	
	
	public void showStudentInfo() {
		System.out.println(studentId + " 학번을 가진 학생의 이름은 "+ studentName + " 이고 이 학생의 집 주소는 " + address + " 입니다. " );	
	} 
	public void setStudentName( String name) {
		studentName = name;
	}
	
};


