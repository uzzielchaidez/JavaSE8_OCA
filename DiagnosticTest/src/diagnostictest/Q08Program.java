package diagnostictest;

public class Q08Program {
    public static void main(String [ ] args) throws java.io.IOException, ClassNotFoundException {
        new Q08Program().doIt();
        new Q08Program().didIt();
    }

    static void doIt()throws java.io.IOException {
        throw new java.io.IOException();
    }

    static void didIt()throws ClassNotFoundException{
        throw new SecurityException();
    }
 }