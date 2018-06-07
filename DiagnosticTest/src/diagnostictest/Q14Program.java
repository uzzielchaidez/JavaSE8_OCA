package diagnostictest;

public class Q14Program {

    public static void main(String args[ ]) {
        System.out.println("Main ");
    }

    { System.out.println("Whiz "); };           // Solamente se ejecuta cuando se crea el objeto    

    static{ System.out.print("Static "); };
}  

