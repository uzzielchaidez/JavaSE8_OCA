package diagnostictest;

public class Q32Program{

    public static void main(String args [ ]) {

        final int x;
        x = 0;                                      // Esto no hace la variable constante
        final int y = 2;

        switch(x) {
            case x : {System.out.print("A");}       // Se requiere constante
            case 1 : System.out.print("B");
            default : System.out.print("default"); break;
            case y : System.out.print("C");
        }
    }
 }