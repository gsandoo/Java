package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public String grade;

	// default Student 사용 원할 시
	public Student() {};

	
	// 클래스 안에 생성자 생성 시
	public Student (int studentNumber , String studentName , String grade) {
		
		// 멤버변수임을 알려주기위해 this 를 쓴다.
		// 추후에 db 에 넣기위해 멤버변수에 담아줘야 하기에 쓴다.
		this.studentNumber = studentNumber;
		this.grade = grade;
		this.studentName = studentName;
		
		System.out.println(studentName + " 학생의 학번은 " + studentNumber + " 입니다. 성적은 " + grade + " 입니다.");
	}
	
	public String showStudentInfo() {
		
		
		return studentName + " 학생의 학번은 " + studentNumber + " 입니다. 성적은" + grade + " 입니다 ";
		
	};
}
