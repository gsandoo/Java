package ch24;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String name;
	ArrayList<Subject> subjectList;
	
	
	
	public Student(int studentID  , String name) {
		this.studentID = studentID;
		this.name= name;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name , int score) {
		Subject subject = new Subject();
		subject.setScore(score);
		subject.setName(name);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject  : subjectList) {
			total += subject.getScore();
			System.out.println("학생" + name + "의 " + subject.getName() + "의 점수는" + subject.getScore() + "입니다");
		}

		System.out.println(name + "의 총점은" + total + "입니다" );
	}
	
	
}
