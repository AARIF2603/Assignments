package com.java.bridgelabz;

public class Summation {
	public static void main(String args[]) {
		int sum = 0;
		int invalid = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				 sum += Integer.parseInt(args[i]);
				} catch (NumberFormatException e) {
				invalid++;
				}
				}
				System.out.println("Total no.of arguments: "+args.length);
				System.out.println("Invalid Integers: "+invalid);
				System.out.println("Sum: "+sum);
				
		}
		

}


