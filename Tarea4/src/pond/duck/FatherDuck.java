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
public class FatherDuck {
    public String noise = "quack";
    
    public void quack() {           // Se cambia de privado a public
        System.out.println(noise);  // private access is ok
    }
    
    public void makeNoise() {       // Se cambia de privado a public
        quack();                    // private access is ok
    }
}
