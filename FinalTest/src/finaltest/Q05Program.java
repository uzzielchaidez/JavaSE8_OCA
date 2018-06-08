package finaltest;

import java.util.Arrays;

public class Q05Program {
    public static void main(String[] args) {

        int[ ] ints = {2,-1,4,5,3};
        Arrays.sort(ints);
        System.out.print(Arrays.binarySearch(ints, -1));
    }
}