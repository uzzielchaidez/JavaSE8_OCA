package diagnostictest;

class Q50Program {
    static {                // Bloque estatico se ejecuta desde que inicia el progama
        x = 10;             // Variable no puede ser inicializada si no existe aun declaracion
        y = 5;              // Variable si se inicializa porque ya esta declara por contexto estatico
    }
    final int x;
    final static int y ;
    public static void main(String args [ ]) {
        try {
            Q50Program pr = new Q50Program ();
            int c = pr.x/y;
            System.out.print(c);
        } catch(ArithmeticException E) {
            System.out.print("Arithmetic Exception");
        }
    }
}