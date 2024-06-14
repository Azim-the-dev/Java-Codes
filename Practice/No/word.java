package No;

public class word {
    public static void main(String[] args) {
        String str = "Hello World";

        String[] words = str.split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
