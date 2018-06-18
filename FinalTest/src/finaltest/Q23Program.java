package finaltest;

public class Q23Program {
    public static void main(String[] args) {
        int x = -5;
        
        System.out.println(x == 0 ? "0" : x > 0 ? ">" : "<");
        //System.out.println(x == 0 ? "0", x > 0 ? ">" : "<");
        //System.out.println(x == 0 ? "0", x > 0 ? ">" , "<");
        //System.out.println(x == 0 : "0" ? x > 0 : ">" ? "<");
    }
}
