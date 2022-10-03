//fibonacci series --> Addition of previous two Numbers
//eg: 0 1 1 2 3 5 8 13.... 
package com.bridgelabz.day6problems;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int series,a=0,b=1,c;
		System.out.println("Enter Fibonacci Series Upto: ");
		Scanner obj = new Scanner(System.in);
		series = obj.nextInt();
		
		System.out.println("Fibonacci series is: ");
		
		for(int i=0; i<=series; i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
			

	}

}
