package finaltest;

public class Q24Program {
    public static void main(String args[]) {
        int x = 1;
        int y = 0;
        int z = 2;
        int out = x + z* y/z;       System.out.println(out);
        
        out = (x + y) * z;          System.out.println(out);    // A
        out = (x + y * y) / z;      System.out.println(out);    // B
        //out = x + y ( * y / z);     System.out.println(out);  // C
        out = (x + y) * (y / z);    System.out.println(out);    // D
    }
}