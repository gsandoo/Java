package ch07;

public class Plastic extends Material {

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 plastic 입니다.";
	}

	@Override
	public void doPrint() {
		System.out.println("plastic 으로 준비하겠습니다.");
	}
	
	
}
