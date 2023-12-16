// 2. To find the factorial of a given number

import java.util.Scanner;

public class J02_Factorial {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        System.out.print("The factorial of " + num + " is: " + factorial(num));

        scn.close();
    }
}