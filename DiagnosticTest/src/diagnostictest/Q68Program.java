package diagnostictest;

public class Q68Program{

    public static void main(String [ ] args) {
        char [ ] chars = {'1','Z','0','-','8','1'};
        StringBuilder sb = new StringBuilder();
        sb.append(chars,0,chars.length-1);          // sb = 1Z0-8

        sb.append("08");                            // sb = 1Z0-808
        sb.setLength(4);                            // sb = 1Z0-
        sb.insert(5, "10");                         // Excepction StringIndexOutOfBoundsException

        System.out.print(sb);
    }
}