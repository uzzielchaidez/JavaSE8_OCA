package freetest;

public class Q19Program{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("1Z0");
        sb.append(sb.concat("-808"));              // Error de compilacion, la sentencia sb.concat() tiene tipo de retorno 
        System.out.println(sb);
    }
}
