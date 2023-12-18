import java.util.Scanner;

public class J08_Palindrome {

    public static boolean palindrome(String str) {

        String str2 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str2 = ch + str2;
        }

        if (str.equals(str2)) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        scn.close();

        if (palindrome(str) == true) {
            System.out.println("The string is palindrome");
        }

        else {
            System.out.println("The string is not palindrome");
        }
    }
}