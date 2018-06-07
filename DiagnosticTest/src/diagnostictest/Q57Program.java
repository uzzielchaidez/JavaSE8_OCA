package diagnostictest;

public class Q57Program {

    public static void main(String args [ ]) {

        Double d1 = 0.0/0.0;

        System.out.print(Double.isNaN() + " ");         // uso incorrecto de la funcion isNaN
        System.out.print(d1.isInfinite());              // usco correcto de la funcion isInfinite
    }
}