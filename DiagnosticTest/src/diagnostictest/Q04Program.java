package diagnostictest;
public class Q04Program {
    public static void main(String [ ] args) {

        int []ints = new int[0b101];        //Binario igual a 5, se inicializa en 0 automaticamente
        int len = ints.length;
        
        for(int i : ints)
            System.out.print(i);
    }
}
