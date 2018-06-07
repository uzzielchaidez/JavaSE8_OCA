package diagnostictest;

class A {
    static void method() {
        System.out.print(" A B");
    }
    
    void run() {
        System.out.print("Animal run");
    }
}

class B extends A {
    protected static void method() {
        System.out.print(" C D");
    }
    
    public void run() {
        System.out.print(" Dog runs");
    }
}

class Q42Program {
    public static void main(String [ ] args) {
        A a = new B();          
        a.method();             // Considerara los metodos estaticos del tipo de dato, no se sobreescribe
        a.run();                // Considerara los metodos sobreescritos no estaticos de la instancia
        
        B b = new B();
        b.method();             // Considerara los metodos estaticos del tipo de dato, no se sobreescribe
        b.run();                // Considerara los metodos sobreescritos no estaticos de la instancia
    }
}