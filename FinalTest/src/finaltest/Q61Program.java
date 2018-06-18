package finaltest;

class Q61Program {
    public static void main(String args[]) {
        char[ ] chars = {'A','B','C','D','E','F'};
        String out = String.copyValueOf(chars, 1, 4);
        System.out.println(out);
    }
}