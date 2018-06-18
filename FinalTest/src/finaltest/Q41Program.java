package finaltest;

class Q41Program {
    public static void main(String args[]) {
        int array[ ] = {1,2,3};
        double dbls[ ] = array;                 // Asignacion invalidad, no promocional
        double sum = 0;
        for (int i = 0; i < array.length; ++i)
            sum += dbls[i];
        System.out.println(sum);
    }
}