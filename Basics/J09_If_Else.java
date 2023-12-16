package Basics;

public class J09_If_Else {
    public static void main(String args[]) {

        int num1 = 0, num2 = 0;

        if (num1 == 0 && num2 == 0) {
            System.out.println("Error 0");
        }

        else if (num1 >= num2) {
            System.out.println("Num1 is largest");
        }

        else {
            System.out.println("Num2 is largest");
        }
    }
}