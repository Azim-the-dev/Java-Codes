public class J03_Function_Overloading {

    // Overloading Using Data_Types
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    // Overloading Using Parameters
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(sum(10, 10));
        System.out.println(sum(10.99f, 10.99f));
        System.out.println(sum(10, 10, 10));
    }
}