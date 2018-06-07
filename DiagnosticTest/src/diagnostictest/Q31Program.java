package diagnostictest;

public class Q31Program {

    public static void main(String args [ ]) {

        final int x = 0;
        final int y = 2;

        switch(x+y) {
            case x : {System.out.print("A");}
            case 1 : System.out.print("B");
            default : System.out.print("default"); break;       //Default se evalua al final independiente el orden
            case y : System.out.print("C");
        }
    }
 }
