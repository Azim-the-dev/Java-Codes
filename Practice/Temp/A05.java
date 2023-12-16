package Temp;

public class A05 {
    public static void main(String args[]) {
        int num = 0;

        if (num == 0) {
            System.out.println("null");
        } else {
            System.out.println("Error");
        }

        System.out.println("While Loop");
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        System.out.println("Do While Loop");
        do{
            System.out.println(num);
            num--;
        }while(num != 0);

        System.out.println("For Loop");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}