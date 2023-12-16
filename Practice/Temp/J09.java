package Temp;

public class J09 {
    public static void main(String args[]) {
        String str1 = "Azim";
        String str2 = "";
        char ch;

        // I want to reverse Azim;

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            str2 = ch + str2;
        }

        System.out.println(str2);
    }
}