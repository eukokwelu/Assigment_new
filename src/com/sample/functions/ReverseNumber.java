package com.sample.functions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter some Integers :");

		int num = sc.nextInt(), rev = 0;  
				 
		for( ;num != 0; num=num/10)   
		{  
		int remainder = num % 10;  
		rev = rev * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + rev); 
		
		} 
	}


