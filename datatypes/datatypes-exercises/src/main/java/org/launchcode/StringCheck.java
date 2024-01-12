package org.launchcode;

import java.util.Scanner;

public class StringCheck {

    static public void main (String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it," +
                " ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        String check;
        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for?:");
        check = input.next().toLowerCase();

      int index = sentence.indexOf(check);
      int length = check.length();

        System.out.println("The index of the term you selected is "+ index + " The length of the term is "+ length + " Characters long");

        String newSentence = sentence.replace(check,"");
        System.out.println(newSentence);

    }
}
