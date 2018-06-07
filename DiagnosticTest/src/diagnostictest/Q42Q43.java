package diagnostictest;

class Marsupial {
    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}

public class Q42Q43 extends Marsupial {
    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    
    public static void main(String[] args) {
        Q42Q43 joey = new Q42Q43();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
        
        System.out.println(joey.isBiped());
    }
}