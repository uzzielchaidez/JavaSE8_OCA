/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostictest;

/**
 *
 * @author christian.lopez
 */
public class Whiz {
    public static void main(String [ ] args) {
        
        Integer g = 127;
        Integer h = 127;
        
        int m = 128;
        int n = 128;
        
        System.out.println((g == h) + " " + (m == n));
        
        System.out.println(Integer.valueOf(g));
        System.out.println(Integer.valueOf(m));
    }
}
