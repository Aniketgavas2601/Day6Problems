//total random number needed to have all distinct numbers.

package com.bridgelabz.day6problems;

import java.util.ArrayList;
import java.util.Scanner;

public class CouponNumbers {

		// Function to return the next random number
	    static int getNum(ArrayList<Integer> a)
	    {
	        // Size of the vector
	        int n = a.size();
	     
	        // Make sure the number is within
	        // the index range
	        int index = (int)(Math.random() * n);
	     
	        // Get random number from the vector
	        int num = a.get(index);
	     
	        // Remove the number from the vector
	        a.set(index, a.get(n - 1));
	        a.remove(n - 1);
	     
	        // Return the removed number
	        return num;
	    }
	     
	    // Function to generate n
	    // non-repeating random numbers
	    static void generateRandom(int n)
	    {
	        ArrayList<Integer> a = new ArrayList<>(n);
	     
	        // Fill the vector with the values
	        // 1, 2, 3, ..., n
	        for (int i = 0; i < n; i++)
	            a.add(i + 1);
	     
	        // While vector has elements
	        // get a random number from the vector and print it
	        while (a.size() > 0)
	        {
	            System.out.print(getNum(a) + " ");
	        }
	    }
	 
	    // Driver code
	    public static void main(String []args)
	    {
	       System.out.println("Enter How Many Random Numbers You Wont From Coupon: "); 
	       Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	         generateRandom(n);
	    }
	}
