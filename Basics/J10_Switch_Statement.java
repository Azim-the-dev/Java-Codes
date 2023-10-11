import java.util.Scanner;

public class J10_Switch_Statement {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        switch (num) {
            case 1:
                System.out.println(num);
                break;

            case 2:
                System.out.println(num);
                break;

            case 3:
                System.out.println(num);
                break;

            case 4:
                System.out.println(num);
                break;

            case 5:
                System.out.println(num);
                break;

            default:
                System.out.println("Null");
        }

        scn.close();
    }
}