package org.launchcode;

import java.util.Scanner;


public class Area {

    public static void main (String[] args) {

        double length;
        double width;

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of your rectangle?:");
        length = input.nextDouble();
        System.out.println("What is the width of your rectangle?:");
        width = input.nextDouble();
        input.close();


        System.out.println("The area of your rectangle is:"+ length * width);

    }
}