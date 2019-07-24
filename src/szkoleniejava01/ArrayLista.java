/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szkoleniejava01;

import java.util.List;

/**
 *
 * @author Adrian
 */
public class ArrayLista {
        String surname, name;
        int wiek;
    public ArrayLista(String surname, String name, int wiek){
        this.surname = surname;
        this.name = name;
        this.wiek = wiek;
    }
        @Override
    public String toString(){
        return surname + name + wiek;
    }
}
