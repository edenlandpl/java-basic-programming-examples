/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szkoleniejava01;

/**
 *
 * @author Adrian
 */
public class RowerForInterface implements Interfejs01 {

    @Override
    public void jazdaInterface(int predkosc) {
        System.out.println("Jedziemy z prędkościa .. " + predkosc);
        
    }

    @Override
    public void stopInterface() {
        System.out.println("Stop rowerowi");
    }
    
    
}
