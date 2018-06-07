package diagnostictest;

public class Q17Program {

    public static void main(String args [ ]) {
        int x = 2;
        for ( int x = 0; x < 3; x++ ) {     // No se debe declarar mas de una vez la misma variable
            System.out.print(x);
        }
    }
}