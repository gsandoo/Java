package ch04;

import ch02.Array;

public class MyArrayStack {

	Array arrayStack; // null
	int top; //0
	
	public MyArrayStack() {
		top = 0;	
		arrayStack = new Array();
		
	}
	
	public MyArrayStack(int size) {
		top	= 0 ;
		arrayStack = new Array(size);
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println(" stack is full.");
			return ; 
		}
		else arrayStack.addElement(data);
		top++;
	}
	
	
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("stack is empty.");
			return;
		}
		else arrayStack.removeElement(--top);
	}
	
	
	public boolean isFull() {
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		}
		else return false;
		
	}
	public void print() {
		arrayStack.printAll();
	}
	
}
