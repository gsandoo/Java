package ch07;

public class Powder extends Material {


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 powder 입니다.";
	}

	@Override
	public void doPrint() {
		System.out.println("powder 로 준비하겠습니다.");
	}
	
	
}
