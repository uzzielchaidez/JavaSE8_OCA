package finaltest;

import java.time.LocalDate;

public class Q66Program {
    public static void main(String[] args) {
        LocalDate l = LocalDate.of(2014, 1, 31).plusMonths(1);
        System.out.println(l);
    }
}