package Basics;

public class J12_Recursion {
    public static void main(String[] args) {
        int num = 7;

        System.out.println("The Factorial is: " + fac(num));
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}