package ch24;

public class StudentTest {

	public static void main(String[] args) {

		Student studentlee = new Student(1001, "Lee");
		
		studentlee.addSubject("국어" , 100);
		studentlee.addSubject("수학" , 100);
		
		
		Student studentkim = new Student(1002, "kim");
		
		studentkim.addSubject("국어" , 100);
		studentkim.addSubject("수학" , 70);
		studentkim.addSubject("영어" , 55);
		
		
		studentlee.showStudentInfo();
		System.out.println("=================");
		studentkim.showStudentInfo();
	}

}
