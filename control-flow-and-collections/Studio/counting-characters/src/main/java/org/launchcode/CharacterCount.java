package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
                " So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersArray = quote.toCharArray();

        HashMap<Character,Integer> counts = new HashMap<>();

        for ( char words : charactersArray) {
            if ( counts.containsKey(words)) {
                counts.put(words, counts.get(words) + 1);
            } else {
                counts.put(words,1);
            }
        }

        for (Map.Entry<Character,Integer> count : counts.entrySet()) {
            System.out.println(count.getKey()+ ": " + count.getValue());
        }

    }
}
