package com.linkedlistvectorprogram;

import java.util.LinkedList;

public class LinkedListClear {
	public static void main(String[] args) {
		 LinkedList<String> names=new LinkedList<String>();
		    names.add("thilaksha");
		    names.add("thisha");
		    names.add("kanishka");
		    System.out.println("before clear method output is");
		    System.out.println(names);
		    names.clear();
		    System.out.println("after clear method output is");
		    System.out.println(names);
	}

}
