package com.bridgelabz.stackandqueues;

import com.bridgelabz.linkedlist.*;

public class MyStack<K> 

{
	private final MyLinkedList myLinkedList;
	
	public MyStack() 
	{
		this.myLinkedList = new MyLinkedList();
	}
	
	public void push(INodeIF<K> newNode)
	{
		myLinkedList.addNode(newNode);
		
	}
	
	
	
}