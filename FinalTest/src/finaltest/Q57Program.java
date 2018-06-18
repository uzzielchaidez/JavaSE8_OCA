package finaltest;

class Q57Program {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("A");
        sb.append(new char[]{'B','C'});
        sb.append(3);
        sb.append(true);
        System.out.print(sb);       //ABC3true
    }
}