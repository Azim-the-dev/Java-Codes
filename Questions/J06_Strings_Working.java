// Write a program that show working of different functions of String and  StringBufferclasss like: 
// setCharAt( ), setLength( ), append( ), insert( ), concat( )and  equals( ).  

public class J06_Strings_Working {
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Azim";

        StringBuilder stb = new StringBuilder(str1);
        stb.setCharAt(1, 'a');
        System.out.println("setCharAt: " + stb.toString());

        // concat
        String con = str1.concat(" ").concat(str2);
        System.out.println("concat: " + con);

        // equals
        boolean isEqual = str1.equals(str2);
        System.out.println("equals: " + isEqual);

        // Example for StringBuffer class
        StringBuffer buffer = new StringBuffer("Java");

        // setLength
        buffer.setLength(2);
        System.out.println("setLength: " + buffer.toString());

        // append
        buffer.append(" is fun!");
        System.out.println("append: " + buffer.toString());

        // insert
        buffer.insert(0, "Programming ");
        System.out.println("insert: " + buffer.toString());
    }
}
