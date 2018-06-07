
package diagnostictest;

class Q49Program {
    int x = 013;                // Sistema Octal 013 = Sistema Decimal 11
    public static void main(String [ ] args) {
        Q49Program pr = new Q49Program ();
        pr.go(22);
    }
    void go(final int i) {
        System.out.print(i/x);
    }
}