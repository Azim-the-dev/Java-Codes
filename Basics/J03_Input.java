package Basics;

import java.util.Scanner;
// import java.util.*;

public class J03_Input {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter: ");
        float a = scn.nextFloat();
        System.out.println(a);

        scn.close();
    }
}

/*
 * Input in Java
 * --> next
 * --> nextLine
 * --> nextInt
 * --> nextByte
 * --> nextFloat
 * --> nextDouble
 * --> nextBoolean
 * --> nextShort
 * --> nextLong
 */