package finaltest;

public class Q52Program {
    public static void main(String[] args) {
        int i1 = 10;
        int i2;
        if (i1 > 2) {
            i1 = 1;
            i2 = 1;
        } else {
            i1 = 2;
        }
        System.out.println(i1+i2);      // i2 no inicialiazada, error de compilacion
    }
}
