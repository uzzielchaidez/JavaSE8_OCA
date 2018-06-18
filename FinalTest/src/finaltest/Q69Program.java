
package finaltest;

import java.time.LocalDate;

public class Q69Program {
    public static void main(String[] args) {
        //LocalDate d1 = LocalDate.parse("2015-11-31");         // Noviembre 31 no existe
        //LocalDate d2 = LocalDate.lastDayOf(2015);             // Sintaxis invalida
        //LocalDate d3 = LocalDate.ofDay(2015, 365);            // sintaxis invalida
        LocalDate d4 = LocalDate.ofYearDay(2015, 365);          // Instacia con Año y Dia del Año
        
        System.out.println(d4);
    }
}
