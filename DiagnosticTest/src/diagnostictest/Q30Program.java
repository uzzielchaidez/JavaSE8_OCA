package diagnostictest;

public class Q30Program {

    public static void main(String args[ ]) {
        int x = 10;

        if (x > 10);                        // Contiene un ";"
            System.out.println(">");
        else if(x < 10)
            System.out.println("<");
    }
}