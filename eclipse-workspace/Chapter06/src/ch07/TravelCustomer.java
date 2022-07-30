package ch07;

public class TravelCustomer {
	
	
	private String name;
	private int age;
	private int pay;
	
	public TravelCustomer(String name , int age , int pay ) {
		this.name=name;
		this.age=age;
		this.pay=pay;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}


	@Override
	public String toString() {
		return ("name: " + ":" + name + " age: " + age + " payment: " + pay );

	}
	
	
}
