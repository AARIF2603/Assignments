package com.java.bridgelabz;

public class SpringSeason {
	public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); // get the month from the command line
        int d = Integer.parseInt(args[1]); // get the day from the command line

        // check if the date is within the spring season
        boolean isSpring = (m == 3 && d >= 20 && d <= 31) ||
                           (m == 4 && d >= 1 && d <= 30) ||
                           (m == 5 && d >= 1 && d <= 31) ||
                           (m == 6 && d >= 1 && d <= 20);

        System.out.println(isSpring);
    }

}
