package ch09;

public class Student {
	// 멤버변수 (클래스 바로 위에)
	int studentId;
	String studentName;
	
	Subject korea; // Subject 클래스 불러오기
	Subject math;
	
	
	// student 생성자 생성
	// id 와 name 인자로 들어올 시
	Student(int id, String name){
		studentId = id; // 멤버변수 id 에 대입
		studentName = name; // 멤버변수 name 대입
		
		korea = new Subject(); //korea 인스턴스
		math = new Subject();
	}
	
	public void setKoreaSubject( String name , int score) {
		korea.subjectName = name ; //Subject 클래스에 있는 
		korea.score = score;
	}
	public void setMathSubject( String name , int score) {
		math.subjectName = name ; 
		math.score = score;
	}
	public void showTotalScore() {
		int total = korea.score + math.score ;
		System.out.println(studentName + " 학생의 총점은 " + total + " 입니다. ");
	}
}
