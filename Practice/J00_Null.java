import java.util.Scanner;

class J00_Null {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scn.nextLine();

        System.out.println("Your Name Is: " + name);

        System.out.print("Do Want To Know My Name (Y/N): ");
        char ch = scn.next().charAt(0);

        if (ch == 'A' || ch == 'y') {
            System.out.println("My name is 'Azim'");
        } else if (ch == 'N' || ch == 'n') {
            System.out.println("No Problame.");
        } else {
            System.out.println("Weong Input!");
        }

        scn.close();

        // String str = "Azim";
        // int num = (int) str;
    }
}