import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter temperature in celsius: ");
        int celsius = scn.nextInt();
        scn.close();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}

// Formula

// double fahrenheit = (celsius * 9/5) + 32;
// double celsius = (fahrenheit - 32) * 5/9;