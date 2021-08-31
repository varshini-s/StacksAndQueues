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
	
	
}
