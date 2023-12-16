import java.util.Scanner;

public class J04_2D_Array {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        // int row = matrix.length;
        // int col = matrix[0].length;
        // //For length of rows and columns

        System.out.println("Enter the element of Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int z = 0; z < matrix.length; z++) {
                matrix[i][z] = scn.nextInt();
            }
        }

        System.out.println("\nHere is your Matrix:\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int z = 0; z < matrix.length; z++) {
                System.out.print(matrix[i][z] + "\t");
            }
            System.out.println();
            System.out.println();
        }
        scn.close();
    }
}