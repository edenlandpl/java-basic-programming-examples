/* file name    : {name}
 * authors      : Adrian edenland.pl
 * created      : {2018.09.03}
 * copyright    : MIT
 * version      : 0.1
 */

/*
 * Program szkoleniowy
 */
package szkoleniejava01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SzkolenieJava01 {

    public static void main(String[] args) {
//        Switch przelacznik = new Switch();
//        przelacznik.Switch();
        
//        PetlaTablica petla = new PetlaTablica();
//        petla.PetlaTablica();
       
//        Tablice Tablice = new Tablice();    // Klasa nazwaObiektu 
//        Tablice.Tablice();
        
//        Kalkulator kalkulator = new Kalkulator();
//        kalkulator.kalkulator();
//        
//        System.out.println("Różnicówka " + kalkulator.wynik);
        
        //public class Point{
        //public int x
        // public void setx(int x){
        // this.x = x // this.x - odnosi się do zmiennej "globalnej, czyli klasy"
        //}
        // Point p = new Point();
        //
        // dostęp do składowej obiektu
        // p.x = 10;
        // dostęp do metody
        // p.setx(20);        
        // Wywołanie konstruktora w zalezności od parametrów wejściowych
        Konstruktor konstruktor = new Konstruktor (1.0,1,1,1);
        Konstruktor konstruktor01 = new Konstruktor (1.0,1,1,1);
        Konstruktor konstruktor02 = new Konstruktor (1,1,1,1);
        konstruktor.Numer();
        
        // Pobieramy dwie zmienne z dwóch klas, podstawowej i rozszerzonej. 
        // Poprzez super() pobieramy dane z klasy nadrzędnej do podrzędnej.
        Rozszerzana dzicz = new Rozszerzana(123, 321);
        dzicz.Wypisz();
        //System.out.println("Liczba y = " + dzicz.Wypisz());
        
        ZmiennePrywatne prywata = new ZmiennePrywatne(56);                  // konstruktor z wartością 56
        System.out.println("Prywatna liczba to = " + prywata.PodajX(5));    // ale tutaj zmieniamy wartość na 5
        
        PrzaladowanieMetod przeladowanie = new PrzaladowanieMetod();
        przeladowanie.draw("Coś ma kota");
        przeladowanie.draw(435);
        przeladowanie.draw(234.654);
        przeladowanie.draw(333, 444.666);
        short ss = 23;
        przeladowanie.draw(ss);     // niejawna konwersja na INT
        
        KlasaAbstakcyjnaRozszerzona abstrakcyjna = new KlasaAbstakcyjnaRozszerzona();
        abstrakcyjna.draw();
        
        // metoda final - nnie można zastąpić / nadpisać podczas dziedziczenia
        
        // Implementacja Interface. Metody zadeklarowane w Interface, z zaimplementowane w Rower...
        RowerForInterface rower = new RowerForInterface();
        rower.jazdaInterface(5);
        rower.stopInterface();

        
        List<ArrayLista> list = new ArrayList<>();
        list.add(new ArrayLista("Nowak", "Adam", 10));// nowy obiekt
        list.add(new ArrayLista("Nowak", "Adam", 20));
        list.add(new ArrayLista("Nowak", "Adam", 30));
        list.add(new ArrayLista("Nowak", "Adam", 40));
        list.add(new ArrayLista("Nowak", "Adam", 50));
        list.forEach(System.out::println);
        list.remove(3); // usuwanie z listy na numerze 3
        list.forEach(System.out::println);
        //list.sort(String::compareToIgnoweCase);
        //Collections.sort(list); trzeba utworzyć obiekt i przesłać i użyć compare ...
        
       //InterfaceArrayList01 obiekt = new InterfaceArrayList01() {};
        InterfaceArrayList00 obiekt = null;
        obiekt = new InterfaceArrayList01();
        obiekt.x();
        obiekt = new InterfaceArrayList02();
        obiekt.x();
        // tworzenie arraylist dla obiektów - tutaj obiekty które wypisują na ekranie
        List<InterfaceArrayList00> lista = new ArrayList<InterfaceArrayList00>();
        lista.add(new InterfaceArrayList01());
        lista.add(new InterfaceArrayList02());
        lista.add(new InterfaceArrayList01());
        lista.add(new InterfaceArrayList02());
        for(int i=0; i<lista.size();i++){
            lista.get(i).x();
        }
        // WYJATKI
        double liczba01, liczba02, liczba03;
        Scanner inputScanner = new Scanner(System.in);        
        System.out.println("Wprowadź liczbę 1");
        liczba01 = inputScanner.nextInt();
        System.out.println("Wprowadź liczbę 2");
        liczba02 = inputScanner.nextInt();
        // wyjątek oraz własny tekst pojawiający się przy błędzie
        try {
            liczba03 = dziel(liczba01,liczba02);
            System.out.println(liczba03);
        }catch (WyjatkiKalkulator e){
            System.out.println(e.getMessage());
           
                    //System.err.println("Catch IwOException: " + e.getMessage());
                    }
    }    
        public static double dziel(double a, double b)throws WyjatkiKalkulator{
        if (b == 0)
            throw new WyjatkiKalkulator();
          return a/b;
    }    
}
