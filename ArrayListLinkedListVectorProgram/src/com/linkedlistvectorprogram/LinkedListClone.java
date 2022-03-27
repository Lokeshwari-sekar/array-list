package com.linkedlistvectorprogram;

import java.util.LinkedList;

public class LinkedListClone {
	public static void main(String[] args)
	{
		LinkedList<String> llob=new LinkedList<String>();
		llob.add("parents");
		llob.add("friends");
		llob.add("pets");
		System.out.println("linked list is"+llob);
		
		LinkedList<String> copy=(LinkedList<String>) llob.clone();
		System.out.println("cloned linkedlist is"+copy);
		
		
		
	}

}
