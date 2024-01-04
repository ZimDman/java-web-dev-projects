package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();
        FlavorComparator comparator = new FlavorComparator();
        ConeComparator comparator1 = new ConeComparator();
        ToppingsComparator comparator2 = new ToppingsComparator();


        toppings.sort(comparator2);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(comparator);
//        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(comparator1);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for(Flavor flavor: flavors ) {
            System.out.println(flavor.getName());
        }

        for(Flavor flavor: flavors ) {
            System.out.println(flavor.getAllergens());
        }

        for(Cone cone: cones ) {
            System.out.println(cone.getCost());
        }

        for(Toppings topping: toppings ) {
            System.out.println(topping.getName());
        }

    }
}