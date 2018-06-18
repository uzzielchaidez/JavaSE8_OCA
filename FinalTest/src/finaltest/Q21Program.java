package finaltest;

public class Q21Program {
    public static void main(String[] args) {
        int[ ] arr = new int[]{1,2,3};

        if (arr.length == 0)                    // El if debe estar en bloques porque contiene mas de 2 sentencias
            System.out.print("==0");
            System.out.print(arr.length);
        else if (arr.length> 0)
            System.out.print(">0");
        else
            System.out.print("?");

    }
}
