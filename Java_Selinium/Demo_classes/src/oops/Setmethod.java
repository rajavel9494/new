package oops;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setmethod {
	public static void main(String[] args) {

		Set<Object> s1 = new HashSet<>();// random

		s1.add("arun");
		s1.add("sathish");
		s1.add("senthil");
		s1.add("rajavel");
		
		
		for (Object object : s1) {
			
			System.out.println(object);
			
		}		
		// System.out.println(s1.size());

		// boolean contains = s1.contains("arun");
		// System.out.println(contains);

		// System.out.println(s1.contains("arun"));

		Set<Object> s2 = new LinkedHashSet<>();// insert order

		s2.add("vishnu");
		s2.add("bala");
		s2.add("rajavel");
		s2.add("rubachandran");

		
		for (Object object1 : s2) {
			System.out.println(object1);
		}
		
		System.out.println(s2);

		Set<Object> s3 = new TreeSet<>(); // acending order

		s3.add(10);
		s3.add(20);
		s3.add(30);
		s3.add(40);
		
		
		for (Object object3 : s3) {
			System.out.println(object3);
			
		}

		//s2.retainAll(s3);
		//System.out.println(s2);       //class cast expection

		// s1.retainAll(s2);
		// System.out.println(s1);

		s1.addAll(s2);
		System.out.println(s1);

	}

}
