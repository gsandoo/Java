package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface MyQueue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
	
	
}

public class MyLinkedQueue extends MyLinkedList implements MyQueue {

	MyListNode front; // 노드 맨 앞
	MyListNode rear; // 노드 끝
	
	@Override
	public void enQueue(String data) {
		
		MyListNode newNode;
		
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			 newNode = addElement(data);
			 rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
	}

	@Override
	public String deQueue() {
		// 빼기도 전에 없을때
		if(isEmpty()) {
			return null;
		}
		
		String data =front.getData();
		front=front.next;
		
		// 다 빼서 list 에 값이 없을 때
		if(front == null) {
			rear = null;
		}
		
		return data;
		
		
	}

	@Override
	public void printQueue() {
		printAll();
	}

	
	
}
