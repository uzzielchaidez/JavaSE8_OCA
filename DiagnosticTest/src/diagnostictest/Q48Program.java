package diagnostictest;

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

public class Q48Program implements Walk,Run{

    public int getSpeed() {
        return 6;
    }

    public static void main(String args[ ]) {
        Q48Program an = new Q48Program();
        System.out.println(an.getSpeed());
    }
}
