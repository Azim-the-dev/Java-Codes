// 1. To find the sum of any number of integers entered as command line arguments.  

public class J01_Command_Line {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Please provide two integers as command line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Sum: " + (num1 + num2));

    }
}

// How to use command line arguments in Java?

// javac <File_Name>.java
// java <File_Name> <Arguments> <Arguments>

// Example: javac J01_Command_Line.java
//          java J01_Command_Line 10 20