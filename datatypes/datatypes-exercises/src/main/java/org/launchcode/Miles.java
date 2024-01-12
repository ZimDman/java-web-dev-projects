package org.launchcode;

import java.util.Scanner;

public class Miles {

    public static void main (String[] args) {

        double miles;
        double gallons;

        Scanner input = new Scanner(System.in);

        System.out.println("what is the number of miles you have driven?:");
        miles = input.nextDouble();

        System.out.println("What is the amount of gas in gallons that you have consumed?:");
        gallons = input.nextDouble();
        input.close();

        double mpg = miles / gallons;
        System.out.println("You have averaged " +  mpg +"MPG");
    }
}
