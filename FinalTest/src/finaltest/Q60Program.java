package finaltest;

class Q60Program {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("ABCDEF");
        sb.reverse().reverse().append(12);
        sb.setLength(4);
        System.out.println(sb);
    }
}   