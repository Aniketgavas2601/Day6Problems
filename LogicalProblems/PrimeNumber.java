package com.bridgelabz.day6problems;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int n,count=0;
		System.out.println("Enter a Number: ");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
			if(count == 2)
			{
				System.out.println("prime Number");
			}
			else
			{
				System.out.println("Not prime Number");
			}
		}
		

	}

}
