package freetest;

import java.util.ArrayList;
import java.util.List;

public class Q24Program{

    public static void main(String[] args){
        List<int> list = new ArrayList<>();     // ArrayList no permite lista de tipos de datos primitivos
        list.add(21); list.add(13);
        list.add(30); list.add(11);
        list.removeIf(e -> e%2 != 0);
        System.out.println(list);
    }
}