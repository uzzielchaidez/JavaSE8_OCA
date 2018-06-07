/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostictest;

/**
 *
 * @author christian.lopez
 */
public class Q61Program {
    final int j =32;
    
    public static void main(String args []) {
        char c = 'A';   //ASII value of 'A' is 65 and 'a' is 97
        System.out.print((char)calc(c));
    }
    
    static int calc(int i) {
        return (i + j);             // No se puede usar la variable j, no se encuentra en contexto estatico
    }
}

