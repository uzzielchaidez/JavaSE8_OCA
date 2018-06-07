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
public class GoodDuckling {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack();                           // default access
        System.out.println(duck.noise);         // default access
    }
}
