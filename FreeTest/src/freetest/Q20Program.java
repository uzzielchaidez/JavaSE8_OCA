package freetest;

import java.time.LocalTime;

public class Q20Program {
    public static void main(String[] args) {
        System.out.print(new LocalTime().now());        // Error sintaxis
        System.out.print(new LocalTime());              // Error sintaxis
        System.out.print(LocalTime.now());              // Current time
        System.out.print(LocalTime.today());            // No existe today
    }

}
