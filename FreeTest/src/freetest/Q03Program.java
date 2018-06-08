/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freetest;

/**
 *
 * @author christian.lopez
 */
public class Q03Program {
    public static void main(String[] args) {
        try {
            int array[] = new int[-2];
        } catch (Exception e) {
            System.out.println(e);          // NegativeArraySizeException
        }
    }
}
