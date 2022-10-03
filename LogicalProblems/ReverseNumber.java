//input --> 387
//output --> 783

package com.bridgelabz.day6problems;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num,rem;
		System.out.println("Enter a Number: ");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		
		System.out.println("Reverse Number is: ");
		while(num > 0)
		{
			rem = num%10;
			num = num/10;
			System.out.print(rem);
			
		}
		

	}

}
