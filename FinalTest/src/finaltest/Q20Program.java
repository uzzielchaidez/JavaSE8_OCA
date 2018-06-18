package finaltest;

public class Q20Program {
    public static void main(String [ ] args) {
        int x = 0;
        do {
            System.out.println(x);
        } while (x++ > 0);              // sigue siendo x = 0 , por lo que 0 > 0 = false
    }
}