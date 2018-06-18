package finaltest;

public class Q55Program {
    public static void main(String[] args) {
        type(10);           // int
        type(10.0f);        // float
    }

    public static void type(int x) {
        System.out.print("int");
    }

    public static void type(double x)throws Exception {
        System.out.print("double");
    }

    public static void type(byte x) {
        System.out.print("byte");
    }

    private static void type(float x) {
        System.out.print("float");
    }
}