package ch24;

import java.util.ArrayList;

public class Student {
	
	public String name;
	public int studentId;
	
	ArrayList<Subject> subjectList;
	
	public Student(int sudentId , String name) {
		
		this.name = name;
		this.studentId = sudentId;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String subjectName , int score) {
		
		Subject subject = new Subject();
		subject.setScore(score);
		subject.setSubjectName(subjectName);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		for (Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(name + "의" + subject.getSubjectName() + "점수는 " + subject.getScore() + "입니다");
		}
		System.out.println("총점은" + total + "입니다");
	}
}