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
public class Konstruktor {
    private int x,y,z ,c;
    private double q, w;
    public static int numer; // zmienna statyczna wspólna dla wszystkich obiektów
    public Konstruktor(){
        System.out.println("Konstruktor 01");
        System.out.println(numer);
        numer++;
    }  
    public Konstruktor(int x, int y, int z, int c){
        System.out.println("Konstruktor 02");
        System.out.println(numer);
        numer++;
    }
    public Konstruktor(int x, int y, int z, double q){
        System.out.println("Konstruktor 03");
            System.out.println(numer);

        numer++;
    }
    public Konstruktor(double q, int y, int z, int c){
        System.out.println("Konstruktor 03");
        System.out.println(numer);
        numer++;
    }    
    public void Numer(){
        System.out.println(numer);
    }
}
