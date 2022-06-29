package ch11;

public class Person {
	// this 활용법
	String name;
	int age;
	
	public Person(){
		
		this("이름없음" ,1);
	}
	public Person(String name , int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public static void main(String[]args) {
		Person person = new Person("kim" , 3);
		System.out.println(person.name + "," + person.age);
	}
}
