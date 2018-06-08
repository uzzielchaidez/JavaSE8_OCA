package freetest;

public class Q06Program{

    public static void main(String[] args){

        try{
            Double number = Double.valueOf("120D");
        }catch(NumberFormatException ex){
            System.out.println(ex);
        }
        System.out.println(number);     // Variable no declara dentro del bloque
    }
}