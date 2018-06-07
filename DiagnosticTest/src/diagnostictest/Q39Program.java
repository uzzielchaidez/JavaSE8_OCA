package diagnostictest;

public class Q39Program {

    public static void main(String args [ ]) {
        System.out.print(true ^ false | true);
        System.out.print((true ^ false) | true);
        System.out.print((true ^ false | true));
        System.out.print(true ^ (false | true));        // El simbolo | evalua todos hasta encontrar el 1re true
        
        System.out.print((false | false | false | true | false));
    }
}
