package finaltest;

import java.time.LocalDate;

public class Q67Program {
    public static void main(String[] args) {
        LocalDate lc = LocalDate.of(2015, 1, 31).now();     // lc toma el valor de la fecha en curso
        lc.plusYears(3);                                    // el incremento no se reasigna por lo que no sufre cambios
        System.out.println(lc);                             // Imprime la fecha actual
    }
}