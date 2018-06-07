package diagnostictest;

// El constructor Character no acepta String, solo acepta char entre comillas simples

public class Q58Program {
    public static void main(String args [ ]) {
        Character ch = new Character("a");
        System.out.print(Character.isLetterOrDigit(ch));
    }
}
