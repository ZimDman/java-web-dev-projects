package org.launchcode;

import java.util.Arrays;

public class Array {

    public static void main (String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

       /* for (int i : integerArray) {
            System.out.println(i);
        }*/
        for (int i = 0; i < integerArray.length; i ++) {
            if (integerArray[i]%2!= 0) {
                System.out.print(integerArray[i]);
            }
        }

        String phrase = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will not eat them in a house." +
                " I will not eat them with a mouse.";
        String[] space = phrase.split(" ");
        System.out.println(Arrays.toString(space));

        String[] sentence = phrase.split(" \\.");
        System.out.println(Arrays.toString(sentence));

    }


}