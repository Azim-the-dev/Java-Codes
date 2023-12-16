package Strings;

import java.util.Scanner;

public class J04_String_Builder {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        scn.close();

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb);
    }
}
