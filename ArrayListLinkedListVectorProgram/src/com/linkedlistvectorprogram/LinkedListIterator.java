package com.linkedlistvectorprogram;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args)
	{
		LinkedList<String> linkit= new LinkedList<String> ();
		linkit.add("one");
		linkit.add("two");
		linkit.add("three");
		linkit.add("zero");
		System.out.println(linkit);
		
		//we need separate date instead of list of date
		Iterator<String> it=linkit.iterator();
		
		while(it.hasNext())//here the hash next is moving forward
		{
			System.out.println(it.next());//forward output
		}
		
	}}
