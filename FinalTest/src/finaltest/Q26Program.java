package finaltest;

public class Q26Program {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) { }
        String out = i > 10 ? ">" : "<";
        System.out.println("10" + out + i);
    }
}
