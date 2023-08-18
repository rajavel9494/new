package org.seleniumproject;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		
		list.add(100);
		list.add(12.45);
		list.add(null);
		list.add("rajavel");
		list.add('a');
		list.add(true);
		list.add("rajavel");
		list.add(null);
		System.out.println(list.size());
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(3,"java");
		System.out.println(list);

	}

}
