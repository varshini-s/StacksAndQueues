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
	
	public void printStack()
	{
		myLinkedList.printMyNodes();
	}
	
	public INodeIF<K> peek()
	{
		return myLinkedList.head;
	}
	
}
