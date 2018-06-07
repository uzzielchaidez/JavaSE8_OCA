package diagnostictest;

class Q54Program {
    public static void main(String args [ ]) {
        Print p = new Print();
        
        //insert here
        Print.p2(6);            // No funciona porque es metodo privado
        P.p2(6);                // No funciona porque es metodo privado apesar de que es de una instancia
        p.print(6);             // Si funciona porque es metodo de una instancia y accesible (default)
        Print.print();          // No funciona porque no se esta especificando el parametro
    }
}

class Print {
    private static void p2(int i) {
        System.out.print ( i*2 );
    }
    static void print(int i) {
        System.out.print(i);
    }
}