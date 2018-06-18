package finaltest;

public class Q34Program {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    private void run() {
        System.out.print("A");
    }
}

class B extends A {
    //override method() here            // No se puede sobrescribir por que es private
}