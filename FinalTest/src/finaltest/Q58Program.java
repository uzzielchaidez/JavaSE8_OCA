package finaltest;

class Q58Program {
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder("Whiz");
        sb.append("Labs");
        
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
        System.out.println(sb.length() + sb.capacity());
    }
}
