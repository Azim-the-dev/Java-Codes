package Azim;
class Error {
    public void error() {
        System.out.println("Exception in thread \"main\" java.lang.Error: Unresolved compilation problem:");
        System.out.println("        Syntax error on token '*', delete this token");
        System.out.println("\n        at temp.main(temp.java:12)");
        System.exit(0);
    }
}