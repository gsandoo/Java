package ch04;

public class Person {

	private String name;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
	
	
}
