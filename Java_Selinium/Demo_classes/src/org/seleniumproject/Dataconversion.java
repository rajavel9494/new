package org.seleniumproject;

public class Dataconversion {

	int a = 10; // instance variable

	private void sum() {

	}

	public static void main(String[] args) {

		String s = "123456"; // string to integer
		Integer num = Integer.parseInt(s);
		System.out.println(s);
		System.out.println(num.getClass().getName());

		int s1 = 102;// integer to string
		String num1 = String.valueOf(s1);
		System.out.println(num1);
		System.out.println(num1.getClass().getName());

		String s2 = "9999";
		int i = Integer.parseInt(s2);

		System.out.println(s2 + 9999);
		System.out.println(i + 44);
		System.out.println(s2.getClass().getName());
		
		
		int s3=23456543;
		String var=String.valueOf(s3);
		System.out.println(var);
		System.out.println(var.getClass().getName());

	}

}
