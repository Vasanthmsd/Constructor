package com.wipro;

import java.util.Scanner;

public class Class  {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your name");
	String name = sc.next();
		System.out.println("your name is:" + name);	

		System.out.println("enter your last name");
		String lastname = sc.nextLine();
		System.out.println("your last name is:" + lastname);

		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("your age is:" + age);
	}

}

