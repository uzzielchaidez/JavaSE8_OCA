package finaltest;

class Q45Program {
    public static void main(String args[]) {
        Long l1 = 10l;
        Long l2 = 9l;
        
        System.out.println(Long.remainderUnsigned(l1, l2));
        System.out.println(Long.divideUnsigned(l1, l2));
        
        System.out.println(Long.remainderUnsigned(l1, l2) + Long.divideUnsigned(l1, l2));
    }
}