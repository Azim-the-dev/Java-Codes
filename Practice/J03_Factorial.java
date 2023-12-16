import java.util.Scanner;

public class J03_Factorial {
    public static void main(String args[]) {

        System.out.print("Enter a number: ");
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        scn.close();

        int fac = 1;

        for (int i = 1; i <= num; i++) { // i must be starts from 1 (In case of multplication)
            fac *= i;
        }

        System.out.println("The factorial of " + num + " is " + fac);
    }
}