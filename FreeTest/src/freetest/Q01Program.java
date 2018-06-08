package freetest;

import java.io.*;

public class Q01Program {
    public static void main(String args[]){
        try{
            int whizData[] = new int[10];
            System.out.println("Accessin g Element Eleven :" + whizData[11]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Oops.. Identifed Ex ception :: " + e);
        }
    }
}
