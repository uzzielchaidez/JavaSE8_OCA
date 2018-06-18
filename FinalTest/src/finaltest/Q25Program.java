package finaltest;

public class Q25Program {
    public static void main(String args[]) {
        int x = 1;
        int y = 2;
        int z = 3;
        int out = x++ * y++ * --z;      // 1 * 2 * 2 = 4
        System.out.println(out);
    }
}