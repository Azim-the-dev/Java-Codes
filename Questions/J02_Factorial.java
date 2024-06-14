// 2. To find the factorial of a given number

import java.util.Scanner;

public class J02_Factorial {
    public static int fac(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fac(num - 1);
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        System.out.println("The factorial of " + num + " is: " + fac(num));
    }
}