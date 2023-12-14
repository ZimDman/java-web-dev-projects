package org.launchcode;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        String userQuote;
        Scanner input;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        input = new Scanner(System.in);
        System.out.println("Please enter a string of characters: ");
        userQuote = input.nextLine();

        char[] charactersArray = userQuote.toLowerCase().toCharArray();

        HashMap<Character,Integer> counts = new HashMap<>();

        for ( char words : charactersArray) {
          if (alphabet.indexOf(words) >= 0) {
              if (counts.containsKey(words)) {
                  counts.put(words, counts.get(words) + 1);
              } else {
                  counts.put(words, 1);
              }
          }
        }

        for (Map.Entry<Character,Integer> count : counts.entrySet()) {
            System.out.println(count.getKey()+ ": " + count.getValue());
        }

    }
}
