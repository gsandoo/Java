package ch03;

public class StudentTest {
	
	public static void main(String[] args) {
		// 인스턴스 ( heap 메모리에 저장 된다. )
		Student studentLee = new Student();
		
		// 참조 변수 , 참조 값
		studentLee.address = "강남구 신사동";
		studentLee.studentId= 12321311;
		studentLee.studentName="LeBron James";
		
		studentLee.showStudentInfo();
		
		
		
		
		Student studentMark = new Student();
		
		studentMark.setStudentName("Mark");
		studentMark.address="California";
		studentMark.studentId=13123132;
		
		studentMark.showStudentInfo();
	}
	
}
