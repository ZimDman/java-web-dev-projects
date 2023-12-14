package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static String printFiveLetters(ArrayList<String> words) {
        String selected = " ";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String word: words) {
            if (word.length() == numChars) {
                selected = selected.concat(word);
            }
        }


        return selected;
    }
    public static void main (String[] args) {




        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(15);
        numbers.add(55);
        numbers.add(60);
        numbers.add(25);
        numbers.add(30);
        numbers.add(45);
        numbers.add(90);
        numbers.add(42);

        System.out.println(sumEven(numbers));

        /*ArrayList<String> list = new ArrayList<>();
        list.add("Money");
        list.add("Spoon");
        list.add("Moon");
        list.add("Animal");

        System.out.println(printFiveLetters(list));*/

        String phrase = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will not eat them in a house." +
                " I will not eat them with a mouse.";
        String[] array = phrase.split(" ");
        ArrayList<String> list = new ArrayList<String>(List.of(array));
        System.out.println(printFiveLetters(list));
    }
}
