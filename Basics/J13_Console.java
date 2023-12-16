package Basics;

import java.io.Console;

public class J13_Console {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available");
            return;
        }
        String name = console.readLine("Enter your name: ");
        console.printf("Hello, %s!\n", name);
        char[] password = console.readPassword("Enter your password: ");
        console.printf("Your password was: %s\n", new String(password));
    }
}