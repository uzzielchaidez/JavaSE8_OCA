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
class Q03Program {
    public static void main(String [ ] args) {
        int ints [ ][ ] = new int[3][ ];    //Arreglo bidimensional debe inicializar su tamaño a menos en la 1ra dimension
        ints[1] = new int[ ]{1,2,3};
        ints[2] = new int[ ]{4,5};
        
        System.out.println(ints[1][1]);
    }
}