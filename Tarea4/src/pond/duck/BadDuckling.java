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
public class BadDuckling {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        duck.quack();                           // DOES NOT COMPILE
        System.out.println(duck.noise);
    }
}  
