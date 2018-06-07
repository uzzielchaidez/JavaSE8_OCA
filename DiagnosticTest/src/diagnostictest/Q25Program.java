package diagnostictest;


public class Q25Program {
    
    public static void main(String [ ] args) {
        for(int x = 10, y =6;x > y;x--);                        // Valido
        for(int x = 10, y =6;x-- > y;);                         // Valido
        for(int x = 10, y =6;x > y;System.out.println(x--));    // Valido
        for(;;);                                                // Valido pero loop infinito
    }
}
