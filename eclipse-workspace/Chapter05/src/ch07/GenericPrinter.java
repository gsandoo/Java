package ch07;

public class GenericPrinter<T extends Material> {
	
	// 제너릭 프로그래밍 : 다양한 자료형을 담을 수 있는 타입의 프로그래밍.
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
	
	
}
