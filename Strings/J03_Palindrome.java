package Strings;

import java.util.Scanner;

public class J03_Palindrome {

    public static boolean palindrome(String str) {

        String str2 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str2 = ch + str2;
        }

        if (str.equals(str2)) { // This equals() method is used to compare two strings for equality.
                                // It returns true ifthe strings are equal, otherwise false.
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String args[]) {

        // ANSI escape code constants for text colors
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scn.nextLine();

        scn.close();

        if (palindrome(str) == true) {
            System.out.println(GREEN + "The string is palindrome" + RESET);
        }

        else {
            System.out.println(RED + "The string is not palindrome" + RESET);
        }
    }
}