package Temp;

import java.util.Scanner;

public class A07 {
    public static void main(String args[]) {

        System.out.print("Enter Length: ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println("Enter Elements... ");
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        System.out.println("Printing...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}