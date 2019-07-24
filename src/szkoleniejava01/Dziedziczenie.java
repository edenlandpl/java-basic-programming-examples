package szkoleniejava01;

/**
 *
 * @author Adrian
 */
public class Dziedziczenie {
    private int x; // zmienna prywatna !!
    public Dziedziczenie(int x){
        this.x=x;
    }
    // ustawiamy geter do obsługi zmiennej x
    public int getX(){
        return x;
    }
    // ustawiamy seter do obsługi zmiennej x
    public void setX(){
        this.x = x;
    }
}

