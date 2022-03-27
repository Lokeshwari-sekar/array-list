package com.linkedlistvectorprogram;

import java.util.LinkedList;

public class BasicLinkedList {

	public static void main(String[] args)
	{
		LinkedList<String> lob=new LinkedList<String>();
		lob.add("apple");
		lob.add("orange");
		lob.add("watermelon");
		lob.add("papaya");
		lob.add("banana");
		
		//size of the linked list to find using size() method
		System.out.println("size of the linked list "+lob.size());
		
		//checking using list is empty or not
		System.out.println("list is empty or not? "+lob.isEmpty());
		
		//checking contains method
		System.out.println("list contain this element or not? "+lob.contains("banana"));
		
		

	}

}
