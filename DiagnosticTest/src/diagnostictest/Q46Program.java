package diagnostictest;

public class Q46Program {
    public static void main(String [ ] args) {
        Sub s = new Sub();
        s.method();
    }
}

class Sup {
    protected void method() {
        System.out.print("Sup");
    }
}

class Sub extends Sup {
    //override method () here
    public final void method() {
        System.out.print("Sub");
    }
}