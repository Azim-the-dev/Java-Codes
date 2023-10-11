import java.util.Scanner;

public class J0_Null {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scn.nextInt();
        System.out.print("Enter value for b: ");
        int b = scn.nextInt();

        System.out.print("The product of a and b is = ");
        System.out.println(a * b);

        int x = 10;
        x++;
        System.out.println(x);

        scn.close();
    }

}
