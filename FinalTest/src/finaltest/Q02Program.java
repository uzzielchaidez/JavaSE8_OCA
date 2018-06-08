package finaltest;

public class Q02Program {

    public static void main(String[] args) {

        int ins0[] , ins1;          // la variable ins1 no es un arreglo
        ins0 = new int[2];
        ins1 = new int[2];          // declaracion incorrecta por que ins1 no es arreglo

        ins0[0] = 1;
        ins1[1] = 1;                // asignacion invalida porque ins1 no es arreglo

        System.out.println(ins0[1] + ins1[0]);
    }
}