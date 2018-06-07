package diagnostictest;

/** https://dzone.com/articles/working-with-hashcode-and-equals-in-java */

public class Q41Program {
    public static void main(String[] args) {
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
        
        Student alex3 = alex1;
        System.out.println("alex3 hashcode = " + alex3.hashCode());
        System.out.println("Checking equality between alex1 and alex3 = " + alex1.equals(alex3));
        System.out.println("Checking == between alex1 and alex3 = " + (alex1 == alex3));
        
        String s1 = new String("String");
        String s2 = new String("String");
        System.out.println("s1 hashcode = " + s1.hashCode());
        System.out.println("s2 hashcode = " + s2.hashCode());
        System.out.println("Checking equality between s1 and s2 = " + s1.equals(s2));
        System.out.println("Checking == between s1 and s2 = " + (s1 == s2));
        
    }
}

class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


