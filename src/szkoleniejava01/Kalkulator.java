    package szkoleniejava01;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Kalkulator {
    int liczba01, liczba02, wynik;
    public void kalkulator()
    {
        Scanner inputScanner = new Scanner(System.in);        
        System.out.println("Wprowadź liczbę 1");
        liczba01 = inputScanner.nextInt();
        System.out.println("Wprowadź liczbę 2");
        liczba02 = inputScanner.nextInt();
        wynik = dodawanie(liczba01, liczba02);
        System.out.println("Suma " + wynik);
        wynik = odejmowanie(liczba01, liczba02);
        System.out.println("Różnica " + wynik);
        wynik = mnozenie(liczba01, liczba02);
        System.out.println("Iloczyn " + wynik);
        wynik = dzielenie(liczba01, liczba02);
        System.out.println("Iloraz " + wynik);
    }
        
    public int dodawanie(int a, int b)
    {
        return a+b;
    }
    public int odejmowanie(int a, int b)
    {
        return a-b;
    }
    public int mnozenie(int a, int b)
    {
        return a*b;
    }
    public int dzielenie(int a, int b)
    {
        return a/b;
    }
}
