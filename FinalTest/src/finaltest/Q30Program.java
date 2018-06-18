package finaltest;

public class Q30Program {
    public static void main(String[] args) {
        String in = "abc";

        switch(in) {
            case "AAA" : System.out.println(2);
            case "ABC" : System.out.println(1);
            case "BBB" : System.out.println(3);break;
            case "" : System.out.println(4);
        }
    }
}