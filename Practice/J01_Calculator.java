import java.util.Scanner;

public class J01_Calculator {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter: ");
        int num1 = scn.nextInt();
        char ch = scn.next().charAt(0);
        int num2 = scn.nextInt();

        switch (ch) {
            case '+': {
                System.out.println(num1 + num2);
                break;
            }

            case '-': {
                System.out.println(num1 - num2);
                break;
            }

            case '*': {
                System.out.println(num1 * num2);
                break;
            }

            case '/': {
                System.out.println(num1 / num2);
                break;
            }

            case '%': {
                System.out.println(num1 % num2);
                break;
            }

            default:
                System.out.println("Error!");
        }

        scn.close();
    }
}