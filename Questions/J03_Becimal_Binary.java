// 3. To convert a decimal to binary number. 

public class J03_Becimal_Binary {
    public static void main(String args[]) {
        int decimal_number = 25; // Decimal number

        // Convert decimal to binary
        String binary_btring = Integer.toBinaryString(decimal_number);

        System.out.println("Decimal: " + decimal_number);
        System.out.println("Binary: " + binary_btring);
    }
}