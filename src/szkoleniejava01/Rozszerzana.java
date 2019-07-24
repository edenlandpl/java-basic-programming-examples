package szkoleniejava01;

/**
 *
 * @author Adrian
 */
public class Rozszerzana extends Dziedziczenie{
    public int y;
    public Rozszerzana(int x, int y){
        super(x); // uruchomienie konstruktora z klasy Dziedziczenie
        this.y=y;
    }
    public void Wypisz(){
        System.out.println("Liczba x = " + getX()); // geterem obsługujemy x, która jest prywatna
        System.out.println("Liczba y = " + y);
    }
}
