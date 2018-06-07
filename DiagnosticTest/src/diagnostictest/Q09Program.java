package diagnostictest;

class Q09Program {
    static Integer I;
    public static void main(String args [ ]) {
        String s;
        try {
            s = I.toString();
        } finally {
            try {
                int i = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.print("NumberFormat");
            } finally {
                System.out.print("Fin2");
            }
            System.out.print("Fin1");
        }
   }
}
   