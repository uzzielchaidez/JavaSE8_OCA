package finaltest;

class Exam {
    Exam(Integer in){ code = in;}
    String s = "OCAJP";
    Integer code;
}

public class Q42Program {
    public static void main(String [] args) {
        Integer c = 808;
        Exam w =new Exam(c);
        w = null;
    System.out.println(c); }
}
