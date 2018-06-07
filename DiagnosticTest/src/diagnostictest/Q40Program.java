package diagnostictest;

public class Q40Program{

    public static void main(String [ ] args) {
        String s1 = "Rekha";
        
        //insert here
        String s2 = "Rekha";

        System.out.print(s1.equals(s2)+" ");        // Compara contenido en primitivos y objetos
        System.out.print(s1 == s2);                 // Compara contenido en primitivos y instancias en objetos

        //============================================//
        
        String S1 = "Rekha";
        
        //insert here
        String S2 = new String("Rekha");
        
        System.out.print(S1.equals(S2)+" ");        // Compara contenido en primitivos y objetos
        System.out.print(S1 == S2);                 // Compara contenido en primitivos y instancias en objetos
    }
}
