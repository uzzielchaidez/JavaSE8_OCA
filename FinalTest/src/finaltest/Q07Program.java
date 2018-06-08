package finaltest;

public class Q07Program {
    static Integer i;
    public static void main(String[] args) {
        try {
            System.out.print(i.toString());
        }catch(RuntimeException ex) {
            throw ex;
        }catch(Exception e) {
            System.out.print("e");
        }finally {
            System.out.print("fin");
        }
    }
}