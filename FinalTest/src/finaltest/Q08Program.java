/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

public class Q08Program {

    public static void main(String[] args) {

        int ints[] = get(-1);
        System.out.println(ints.length);
    }

    public static int[] get(int x) {
        return new int[x];
    }
}