package com.bridgelabz.stackandqueues;
import com.bridgelabz.linkedlist.*;


public class MyQueue<K>
{
	private final MyLinkedList myLinkedList;

	public MyQueue() 
	{
		this.myLinkedList = new MyLinkedList();
	}

	
	public void enqueue(INodeIF<K> newNode)
	{
		myLinkedList.appendNode(newNode);
		
	}
	
	public void printQueue()
	{
		myLinkedList.printMyNodes();
	}
	
	public INodeIF<K> dequeue()
	{
		
		return myLinkedList.pop();
	}
	
}
