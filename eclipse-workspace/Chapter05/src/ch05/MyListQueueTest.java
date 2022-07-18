package ch05;

public class MyListQueueTest {

	public static void main(String[] args) {
		
		
		MyLinkedQueue queue = new MyLinkedQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		queue.printQueue();
		
		System.out.println(queue.deQueue());
	}

}
