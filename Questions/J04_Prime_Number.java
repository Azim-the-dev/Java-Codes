// 4. To check if a number is prime or not, by taking the number as input from the keyboard.

import java.util.Scanner;

public class J04_Prime_Number {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a prime number");
        }

        else {
            System.out.println(num + " is not a prime number");
        }
    }
}