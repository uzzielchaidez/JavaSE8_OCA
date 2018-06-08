
package freetest;

public class Q15Program {
    public static void main(String[] args) {
        try {
            Integer number = Integer.valueOf("808.1");      // NumberFormatException
        
            System.out.println(number);
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}