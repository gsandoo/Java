package ch06;

public class StudentTest {

	public static void main(String[] args) {

		
		Student studentKim = new Student();
		studentKim.grade= "F";
		studentKim.studentName="김길수";
		studentKim.studentNumber=123456;
		System.out.println(studentKim.showStudentInfo());
		
		
		
		// Student 생성자가 클래스 안에 생성되어 있으면 매개변수 넣어서 실행 시키면 간편하다.
		Student studentLee = new Student(2018113033 , "강산아" , "A+");
		System.out.println(studentLee.showStudentInfo());
	}

};
