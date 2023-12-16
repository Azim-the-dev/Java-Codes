import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}