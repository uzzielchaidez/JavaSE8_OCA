package finaltest;

class Person {
    Person() {
        System.out.print("CP ");            // 2nd
    }
    static { System.out.print("SP ");}      // 1er
}

class Manager extends Person {
    Manager() {
        System.out.print("CT ");            // 4to
    }
    {System.out.print("IT ");}              // 3ro
}

class Q36Program {
    public static void main(String [] args) {
        Person p1 = new Manager();
    }
}
