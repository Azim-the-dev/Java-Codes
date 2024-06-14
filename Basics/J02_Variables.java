package Basics;

class J02_Variables{
    public static void main(String args[]){

        // int: Used for storing integers.
        int age = 18;
        System.out.println("This is int: " + age);

        // double: Used for storing floating-point numbers.
        double salary = 50000.50;
        System.out.println("This is double: " + salary);

        // boolean: Used for storing true or false values.
        boolean Java_is_Fun = true;
        System.out.println("This is boolean: " + Java_is_Fun);

        // short: Used for storing short integers.
        short temperature = -10;
        System.out.println("This is short: " + temperature);

        // long: Used for storing large integers.
        long population = 7000000000L;
        System.out.println("This is long: " + population);

        // float: Used for storing single-precision floating-point numbers.
        float price = 19.9f;
        System.out.println("This is float: " + price);
        
        // byte: Used for storing small integers.
        byte num = 2;
        System.out.println("This is byte: " + num);

        // char: Used for storing single characters.
        char ch = 'A';
        System.out.println("This is char: " + ch);
    }
}

// Data Types In JAva:
/*   PRIMITIVE:                           
 *    int     = 4 byte [-2^31 to 2^31-1 (about -2 billion to 2 billion)]         
 *    short   = 2 byte [-32,768 to 32,767]
 *    float   = 4 byte [Approximately ±3.4x10^38 with limited precision]
 *    double  = 8 byte [Approximately ±1.8x10^308 with higher precision]  
 *    long    = 8 byte [-2^63 to 2^63-1 (very large range)]
 *    char    = 2 byte [0 to 65,535 (Unicode characters)]
 *    boolean = 1 byte [true or false]
 *    byte    = 1 byte [-128 to 127]
 * 
 *   NON-PRIMITIVE:
 *    String    :[Represents sequences of characters]
 *    Array     :[A collection of elements of the same data type]
 *    Class     :[Blueprint for creating objects	]
 *    Object    :[The root class for all Java classes]
 *    Interface :[Defines a contract for implementing classes]
 */

// Note: 1 Byte = 8 Bit