import java.util.Scanner;

public class J04_Temperature_Converter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scn.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scn.nextDouble();
        System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));

        scn.close();
    }
}