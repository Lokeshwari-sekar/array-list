package com.linkedlistvectorprogram;

import java.util.LinkedList;

public class LinkedListAddAll {

	public static void main(String[] args)
	{
	    LinkedList<String> names=new LinkedList<String>();
	    names.add("thilaksha");
	    names.add("thisha");
	    names.add("kanishka");
	    System.out.println(names);
	    
	    LinkedList<String> names1=new LinkedList<String>();
	    names1.add("latha");
	    names1.add("deepa");
	    System.out.println(names1);
	    System.out.println("after all add method");
	    names.addAll(names1);
	    System.out.println(names);
	   

	}

}
