package Fun;

public class Scaner {

    Scaner(String input) {
    }

    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";

    int nextInt() {
        System.out.println(RED + "java : The term 'java' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name, or if a");
        System.out.println("path was included, verify that the path is correct and try again.");
        System.out.println("At line:1 char:1");
        System.out.println("+ java");
        System.out.println("+ ~~~~");
        System.out.println("    + CategoryInfo          : ObjectNotFound: (jaca:String) [], CommandNotFoundException");
        System.out.println("    + FullyQualifiedErrorId : CommandNotFoundException" + RESET);

        return 0;
    }

    void close() {
        System.out.println();
    }
}