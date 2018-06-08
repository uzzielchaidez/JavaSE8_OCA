package freetest;

import java.util.*;

public class Q25Program {
    public static void main(String[] args){
        ArrayList<String> whizlArray = new ArrayList<String>();
        whizlArray.add("coke");
        whizlArray.add("pepsi") ;
        whizlArray.add("miranda ");
        System.out.println("Total Array List :: " + whizlArray);        // Imprime Lista
        
        String[ ] ws1 = new String[whizlArray.size()];                  // Crear solo el tamaño del arreglo
        String[ ] ws2 = whizlArray.toArray(ws1);                        // Asigna elementos a ws2 y ws1
                                                                        // en ws1 solo si cumple el tamaño requerido
        System.out.println("ws1 == ws2:" + (ws1 == ws2));               // Compara arreglos 
        System.out.println("ws1:" + Arrays.toString(ws1)) ;             // Imprime Lista
        System.out.println("ws2:" + Arrays.toString(ws2));              // Imprime Lista (igual ala anterior)
        
        ws1 = new String[1];
        ws1[0] = "Test Data" ;
        ws2 = whizlArray.toArray(ws1);                                  // Asigna elementos a ws2
                                                                        // en ws1 no asigna porque no cumple con el tamaño requerido
        System.out.println("ws1 == ws2:" + (ws1 == ws2));               // Compara arreglos
        System.out.println("ws1:" + Arrays.toString(ws1)) ;             // Compara arreglos (con un solo elemento)
        System.out.println("ws2:" + Arrays.toString(ws2));              // Compara arreglos (igual ala inicial)
    }
}
