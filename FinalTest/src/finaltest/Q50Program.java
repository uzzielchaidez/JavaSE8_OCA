package finaltest;

public class Q50Program {

    static float f = 10;
    static int i = 100;
    static long l = 1;
    
    public static void main(String[] args) {
        long l1 = i + l;                // long compatibles con int y long
        float f1 = f + l;               // float compatibles con float y long
        int i1 = f + i;                 // int compatible con int, pero no compatible con float
        System.out.println(l1+f1+i1);
    }
}