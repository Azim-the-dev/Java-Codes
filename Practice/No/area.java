import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Height and Width one after one:");
        int height = scn.nextInt();
        int width = scn.nextInt();
        scn.close();

        double area = width * height;

        System.out.println("The area of the rectangle is: " + area);
    }
}

// double width = 5.0; // Replace with your actual width
// double height = 10.0; // Replace with your actual height
// double area = width * height;

// System.out.println("The area of the rectangle is: " + area);