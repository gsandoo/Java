package ch04;

public class StackTest {

	public static void main(String[] args) {
		MyArrayStack stack = new MyArrayStack(3);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		
		
		stack.print();
		
	}

}
