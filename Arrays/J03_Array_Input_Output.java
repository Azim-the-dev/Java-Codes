import java.util.Scanner;

public class J03_Array_Input_Output {
    public static void main(String args[]) {
        int num[] = new int[10];

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scn.nextInt();
        }

        System.out.print("The elements of array are: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ "\t");
        }

        scn.close();
    }
}