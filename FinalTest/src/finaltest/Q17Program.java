package finaltest;

public class Q17Program {

    static int x = 10;
    static int y = 20;

    public static void main(String[] args){
        System.out.print(x + y);
        System.out.print(x + get(30));
    }

    public static int get(int x) {
        return x+y;
    }
}
