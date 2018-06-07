/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pond.duck;

/**
 *
 * @author christian.lopez
 */
public class MotherDuck {
    public String noise = "quack";      // Se cambia de default a publico

    public void quack() {               // Se cambia de default a publico
        System.out.println(noise);      // default access is ok
    }

    public void makeNoise() {           // Se cambia de privado a publico
        quack();                        // default access is ok
    }
}
