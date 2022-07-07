package ch06;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
		
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("인간이 걸어다닙니다.");
	}
	
	public void readBook() {
		System.out.println("인간이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걸어다닙니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
		}
	}
	
class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 날개를 펴고 날아다닙니다.");
	}

	public void flying() {
		System.out.println("독수리가 날갯짓을 합니다.");
	}
	}

public class AnimalTest {

	public static void main(String[] args) {
		
		
		
		Animal hAnimal = new Human();
		Animal eAnimal = new Eagle();
		Animal tAnimal = new Tiger();
		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
//		AnimalTest test = new AnimalTest();
//		// 다형성 코드
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
//		test.moveAnimal(hAnimal);
//		
		
		ArrayList<Animal> animalList = new ArrayList<>();
		
		animalList.add(eAnimal);
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
