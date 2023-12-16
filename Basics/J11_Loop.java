package Basics;

public class J11_Loop {
    public static void main(String args[]) {
        int num = 1;

        // while loop
        System.out.println("\nWHILE LOOP\n");
        while (num <= 10) {
            System.out.println("Hello, Azim");
            num++;
        }

        num = 0;

        // Do while loop
        System.out.println("\nDO WHILE LOOP\n");
        do {
            System.out.println("Hello, Azim");

            if (num == 10) {
                break; // Break Statement
            }

            // if (No_condition) {
            //     continue;
            // }

            num++;

        } while (true);

        // For loop
        System.out.println("\nFOR LOOP\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello, Azim");
        }
    }
}
