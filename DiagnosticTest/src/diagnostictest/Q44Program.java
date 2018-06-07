package diagnostictest;

class Person {
    Person() {
        System.out.print("CP ");                // 2
    }
    
    static{ System.out.print("SP ");}           // 1
}

class Manager extends Person {
    Manager(){
        System.out.print("CT ");                // 4
    }
    {System.out.print("IT ");}                  // 3
}

class Q44Program {
    public static void main(String [ ] args) {
        Person p1 = new Manager();
    }
}
