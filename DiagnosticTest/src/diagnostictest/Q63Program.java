package diagnostictest;

class Animal2 {
    Animal2() {
        super();
    }
}

class Bird extends Animal2 {
    Bird(String name) {
        System.out.print(name);
    }
    Bird() {
        System.out.print("unknown");
    }
}

class Q63Program {
    public static void main(String args [ ]) {
        new Bird("parrot");     // Para todos los casos se manda llamar hasta super(), pero super no arroja nada
    }
}
