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
public class Switch {
    public void Switch(){
       int i=0; 
        while (i<11){ // to trzeba zapamiętać - skrót
            System.out.println(i++);
        }
        
        
        double liczba01, liczba02;
        int dzialanie ;
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Wprowadź pierwszą liczbę ");
        liczba01 = inputScanner.nextDouble();
        
        System.out.println("Wprowadź pierwszą liczbę ");
        liczba02 = inputScanner.nextDouble();
        
        System.out.println("Podaj jaką operację"
                + "1. Dodawanie"
                + "2. Odejmowanie"
                + "3. Mnożenie"
                + "4. Dzielenie ");
        dzialanie = inputScanner.nextInt();
        
        switch (dzialanie){
            case 1 :  System.out.println("Suma wynosi " + (liczba01 + liczba02));
                break;
            case 2 : System.out.println("Różnica wynosi " + (liczba01 - liczba02));
                break;
            case 3 : System.out.println("Iloczyn wynosi " + (liczba01 * liczba02));
                break;
            case 4 : 
                if (liczba02 !=0)
                System.out.println("Iloraz wynosi " + (liczba01 / liczba02));
                System.out.println("Druga liczba nie może by zerem");
                break;
            default : System.out.println("Niewłaściwa operacja");
        }
        
}
}
