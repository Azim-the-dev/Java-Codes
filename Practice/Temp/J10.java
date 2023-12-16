package Temp;

public class J10 {
    public static void main(String args[]) {
        String A = "Azim";

        System.out.println(A);

        A = "Sk Azim";
        // Strings are immutable, So here 'A' assigned new value but old still remain in memory

        System.out.println(A);
    }
}