package finaltest;

class Q44Program {
    public static void main(String args[]) {
        Double d = 10.0;
        Integer i = 10;
        System.out.print((d + i).intValue());   // Al sumar dos wrapers el resultado es un primitivo,
    }                                           // por lo tanto no contiene el metodo intValue.
}