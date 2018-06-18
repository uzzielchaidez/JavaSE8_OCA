package finaltest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Q65Program {
    public static void main(String args[ ]) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/mm/dd");        // mm = minutos, MM = mes
        LocalDateTime ldt = LocalDateTime.of(2015, 10, 10, 11, 22);
        System.out.println(dtf.format(ldt));
    }
}