package finaltest;

class Q64Program {
    public static void main(String args[]) {
        String[ ] strs = {"A","B","C"};
        String join = String.join("-", strs);
        System.out.println(join.length());
        
        System.out.println(join);
    }
}