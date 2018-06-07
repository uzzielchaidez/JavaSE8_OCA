package diagnostictest;

public class Q37Program {
    
    public static void main(String args [ ]){
        int x = 1;
        if ( x > 1 ) {
            System .out.println(">");
        } else if ( x < 1 ) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
        
        System.out.println(x>1?">":x<1?"<":"=");        // Ternario equivalente
        //System.out.println(x>1?">":"<":"=");          // Sintaxis incorrecto
        //System.out.println(x>1?">"?"<":"=");          // Sintaxis incorrecto
        //System.out.println(x>1?">"?"<"?"=");          // Sintaxis incorrecto
    }
}
