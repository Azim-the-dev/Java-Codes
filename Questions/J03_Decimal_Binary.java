// 3. To convert a decimal to binary number. 

import java.util.Scanner;

public class J03_Decimal_Binary {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int decimal = scn.nextInt();
        scn.close();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary: " + binary);
    }
}