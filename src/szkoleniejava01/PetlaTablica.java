/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szkoleniejava01;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class PetlaTablica {
    public void PetlaTablica(){
    int[] tablica = new int[9];
    //int [] tablicaDo01 = new int[9];
    int i, liczba01;
    for(i=0; i<8; i++)
    {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Wprowadź liczbę ");
        liczba01 = inputScanner.nextInt();
        tablica[i]=liczba01;
        if (liczba01 == 0) break;
        System.out.println("Wprowadziłeś =  " + tablica[i]);
    }
    for(i=0; i<8; i++)
        {
            System.out.println("Tablica [" + i + "]" + tablica[i]);
        }
    
    
}
}
