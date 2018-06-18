package finaltest;

class Q32Program {
    public static void main(String args[]) {
        new Q32Program().iterator(new int []{10,12,13});
    }
    
    void iterator(int []i) {
        for(int x = 0; x < i.length; System.out.print(i[x] + " ")) x++;
    }
}
