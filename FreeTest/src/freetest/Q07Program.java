package freetest;

public class Q07Program {
    public static void main(String[] args) {
        int[ ] testData = {1,2,3};
        
        for ( int i : testData ) {          // Estructura de control for sintacticamente correcto
        }
        for ( int i = 0; i < 1; i++ ) {     // Estructura de control for sintacticamente correcto
        }
        for ( i++ ) {                       // Estructura de control for sintacticamente incorrecto (Falta argumentos)
        }
        for ( ; i++; 1 < 1; ) {             // Estructura de control for sintacticamente correcto (tiene 3 ";")
        }
        for ( ; i < 1; 0 ) {                //  Estructura de control for sintacticamente correcto (tiene 3 ";")
        }
    }
}
