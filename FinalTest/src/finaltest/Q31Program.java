package finaltest;

public class Q31Program {
    public static void main(String[] args) {
        long in = 3;
        final byte b = 0;

        switch(in) {                            // Swithc no acepta tipo de dato long
            case b : System.out.print(0);
            case b+1 : System.out.print(1);break;
            case b+3 : System.out.print(3);
            case b+2 : System.out.print(2);break;
            default :System.out.print("?");
        }
    }
}