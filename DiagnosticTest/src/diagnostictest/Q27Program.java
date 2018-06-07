package diagnostictest;

public class Q27Program {

    static int x = 1;

    public static void main(String args [ ]) {
        int[ ] nums = {0,1,2,3,4};
        for(int x : nums) {
            System.out.print(x);
            continue;
            System.out.print(x + Q27Program.x);
        }
    }
}