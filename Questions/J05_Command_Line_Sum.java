// To find the sum of any number of integers interactively,
// i.e., entering every number from  the keyboard,
// whereas the total number of integers is given as a command line argument  

import java.util.*;

public class J05_Command_Line_Sum {
    public static void main(String args[]) {

        // Check if one command line argument is provided
        if (args.length != 1) {
            System.out.println("Please provide the total number of integers as a command line argument.");
            return;
        }

        Scanner scn = new Scanner(System.in);

        int arg_num = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 0; i < arg_num; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scn.nextInt();
            sum += num;
        }

        scn.close();

        System.out.println("Sum: " + sum);
    }
}
