package com.java.bridgelabz;
import java.util.Scanner;

public class MaxMin {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter the second number: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter the third number: ");
	        double c = sc.nextDouble();

	        // Calculate the results of the arithmetic operations
	        double result1 = a + b * c;
	        double result2 = c + a / b;
	        double result3 = a % b + c;
	        double result4 = a * b + c;

	        // Find the maximum and minimum values
	        double max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
	        double min = Math.min(Math.min(result1, result2), Math.min(result3, result4));

	        // Print the results
	        System.out.println("The results of the arithmetic operations are:");
	        System.out.println("a + b * c = " + result1);
	        System.out.println("c + a / b = " + result2);
	        System.out.println("a % b + c = " + result3);
	        System.out.println("a * b + c = " + result4);
	        System.out.println("The maximum value is: " + max);
	        System.out.println("The minimum value is: " + min);
	    
	}


}
