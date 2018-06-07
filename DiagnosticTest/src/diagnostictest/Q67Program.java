package diagnostictest;

public class Q67Program {

    public static void main(String [ ] args) {
        char[ ] chars = {'1','Z','0','-','8','1'};
        StringBuilder sb = new StringBuilder();
        sb.append(chars,0,chars.length-1);
        sb.append('0');
        sb.append("8");
        System.out.print(sb);
    }
}