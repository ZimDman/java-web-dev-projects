package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(20, 0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (String student : studentFiles.keySet()) {
            try {
                int points = CheckFileExtension(studentFiles.get(student));
                System.out.println(student + " gets " + points + " point(s).");
            } catch (InvalidFileNameException e) {
                System.out.println(e.getMessage());
                System.out.println(student + " gets -1 point(s).");
            }
        }



        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        int number = 0;
        if (y == 0) {
            try {
                throw new ArithemticExecption("Please enter an integer greater than 0");
            } catch (ArithemticExecption e) {
                e.printStackTrace();
            }
        } else {
            number = x/y;
        }
        return number;
    }


    public static int CheckFileExtension(String fileName)

        // Write code here!
            throws InvalidFileNameException {

            if (fileName == null || fileName.isEmpty()) {
                throw new InvalidFileNameException("File name cannot be null or empty.");
            } else if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }


    }

}