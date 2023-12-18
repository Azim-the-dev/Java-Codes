import java.util.Scanner;

public class J10_Strings {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String First_Name = scn.nextLine();

        System.out.print("Enter your last name: ");
        String Last_Name = scn.nextLine();

        scn.close();

        // Concatination
        String Full_Name = First_Name + " " + Last_Name;
        System.out.println("Your full name is: " + Full_Name);

        // Length
        System.out.println("The length of your name is: " + Full_Name.length());

        // Print letters
        for (int i = 0; i < Full_Name.length(); i++) {
            System.out.println(Full_Name.charAt(i));
        }

        // Uppercase and lowercase
        System.out.println(Full_Name.toUpperCase());
        System.out.println(Full_Name.toLowerCase());

        // Check equality
        System.out.println(Full_Name.equals("Azim"));
    }
}