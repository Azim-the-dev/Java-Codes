package Temp;

import java.beans.Expression;

public class error {
    public static void main(String[] args) {
        try{
            // int 0 = 0 // Not work due to this error
            // int a = 10 / 0; // This Exception
        } catch(Exception E) {
            System.out.println(E);
        }
        
        System.out.println("Hello, World!");
    }
}