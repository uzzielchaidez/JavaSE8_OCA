/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

import java.io.FileNotFoundException;

/**
 *
 * @author christian.lopez
 */
public class Q10Program {
    
    public static void main(String[] args) {
        new Q10Program();
    }
    
    public void exc() throws FileNotFoundException{

        // INSERT CODE HERE
        //throw new java.io.IOException();
        throw new RuntimeException();
        //throw new Exception();
        //throw new IOException();
    }
}

