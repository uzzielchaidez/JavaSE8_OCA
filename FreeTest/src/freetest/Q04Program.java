package freetest;

public class Q04Program {
    public static void main(String[] args) {
        int sum = 0;

        for(int x = 0;x<=10;x++)
            sum += x;
        System.out.print("Sum for 0 to " + x);      // Variable x solo existe en el bloque del loop
        System.out.println(" = " + sum);
    }
}