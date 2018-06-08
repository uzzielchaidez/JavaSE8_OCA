package freetest;

import java.util.ArrayList;
import java.util.List;

public class Q23Program{

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(21); list.add(13);
        list.add(30); list.add(11);
        list.add(2);
        
        //insert here
        //list.removeIf(e > e%2 != 0);      // Error de sintaxis
        //list.removeIf(e -> e%2 != 0);     // Remueve los impares
        list.removeIf(e -> e%2 == 0);       // Remeve los pares
        //list.remove(e -> e%2 == 0);       // Error de sintaxis
        
        System.out.println(list);           // output [21, 13, 11]
    }
}
