package com.sample.functions;

import java.util.Scanner;


public class Functions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		System.out.println("Substraction : " +(a-b));
		System.out.println("Addition : " +(a+b));
		System.out.println("Division : "+ (a%b));
		

	}

}
