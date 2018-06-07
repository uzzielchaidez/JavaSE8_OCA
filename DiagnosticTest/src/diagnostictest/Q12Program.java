package diagnostictest;

public class Q12Program {
    public static void main(String [ ] args) {
        Object obj = new Double(3);         //Promocion
        Number num = (Number) obj;          //Casteo
        System.out.println(num);
    }
}
