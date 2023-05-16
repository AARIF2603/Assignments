package com.java.bridgelabz;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		int count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year= ");
		while(count!=1) {
		int year = scan.nextInt();
		if (year % 400==0) {
			System.out.println(year+" is a leap year");
			count++;
		}
		else
			System.out.println(year+" is not a leap year");
		
	}
	}		
	

}
