package com.java.bridgelabz;
import java.util.Scanner;

public class RootOfX {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read in the coefficients a, b, and c
	        System.out.print("Enter the coefficient a: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter the coefficient b: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter the coefficient c: ");
	        double c = sc.nextDouble();

	        // Calculate the discriminant (delta)
	        double delta = b * b - 4 * a * c;

	        // Check if the roots are real or complex
	        if (delta < 0) {
	            System.out.println("The roots are complex.");
	        } else {
	            // Calculate the roots
	            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

	            // Print the roots
	            System.out.println("The roots are: " + root1 + " and " + root2);
	        }
	    
	}


}
