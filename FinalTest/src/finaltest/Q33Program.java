package finaltest;

public class Q33Program {
    public static void main(String[] args) {
        Base bs = new Subclass();
        bs.display();
    }
}

class Base {
    public static void display() {
        System.out.println("Base");
    }
}

class Subclass extends Base {
    public static void display() {
        System.out.println("Subclass");
    }
}
