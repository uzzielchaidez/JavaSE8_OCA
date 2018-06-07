package diagnostictest;

import java.util.Arrays;

public class Q06Program {
    public static void main(String [] args) {
        String[ ][ ] strings = {{"A","Z"},{"C","D","S"},{"L"}};
        Arrays.sort(strings);           //ClassCastException, no se puede ordenar arreglos multidimensionales

        for(String [ ]str : strings) {
            for(String s : str) {
                System.out.print(s);
            }
        }
    }
}
