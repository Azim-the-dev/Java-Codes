public class J6_Type_Promotion {
    public static void main(String args[]) {
        // Wrong
        // byte b = 5;
        // b = (b * 2);
        // Not work due to java compiler converts 'b' into int while evaluating expression

        // Right
        byte b = 5;
        b = (byte) (b * 2);

        System.out.println(b);
    }
}

/*
 * Java automatically promotes each byte, short, or char operand to int
 * (While evaluating an expression)
 * 
 * If operand is ling, float or double the whole expression is promoted to long
 * (While evaluating an expression)
 */