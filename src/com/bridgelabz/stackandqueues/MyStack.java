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
	
	public INodeIF<K> pop()
	{
		return myLinkedList.pop();
	}
	
	public boolean isEmpty()
	{
		return myLinkedList.isEmpty();
	}
	
	public int size()
	{
		return myLinkedList.size();
	}
	
}
