package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main (String[] args) {

        double radius;
//        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the radius of your circle?:");
        if (input.hasNextDouble()){
            radius = input.nextDouble();

            if (radius > 0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of your circle with a radius of "+ radius +" is: "+ area);
            } else {
                System.out.println("Please enter a positive number: ");
            }

        } else {
            System.out.println("Please enter a valid number: ");
        }

        input.close();





    }
}
