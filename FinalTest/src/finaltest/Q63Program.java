package finaltest;

class Q63Program {
    public static void main(String args[]) {
        String out = "Oracle certified professional java programmer";
        int x = out.indexOf("O", 0);
        int y = out.lastIndexOf("pro");
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
    }
}