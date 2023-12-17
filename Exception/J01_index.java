package Exception;

public class J01_index {
    public static void main(String[] args) {

        System.out.print("Main method started...\n");

        try {
            int I = 10 / 0;
            System.out.println(I);
        } catch (Exception E) {
            System.out.println("Can't devide by 0");
            System.out.println(E);
        }

        System.out.println("Main method ended...");
    }
}

// NullPointerException
// 