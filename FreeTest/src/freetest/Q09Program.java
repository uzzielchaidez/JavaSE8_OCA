package freetest;

public class Q09Program {
    public static void main(String[] args) {
        
        int x = 10;
        
        if (x > 10) {
            System.out.println(">");
        } else if (x < 10) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
        
        //System.out.println(x>10?">":"<":"=");           // Sintaxis invalida
        //System.out.println(x>10?">"?"<":"=");           // Sintaxis invalida
        System.out.println(x>10?">":x<10?"<":"=");
        //System.out.println(x>10?">"?"<"?"=");           // Sintaxis invalida
    }
}


