package finaltest;
    
public class Q19Program {

    public static void main(String[] args) {

        String[ ] sts = {"A","B","C"};

        for (String i : sts) {
            continue;
        System.out.print(i);            // Variable i no es reconocida
    }
    }
}
