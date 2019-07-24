package szkoleniejava01;

/**
 *
 * @author Adrian
 */
public class PrzaladowanieMetod {
    public void draw (String s){
        System.out.println("Zmienna String = " + s);
    }
    public void draw (int i){
        System.out.println("Zmienna int = " + i);
    }
    public void draw (double f){
        System.out.println("Zmienna double = " + f);
    }
    public void draw (int i, double f){
        System.out.println("Zmienna int = " + i);
        System.out.println("Zmienna double = " + f);
    }
    
}
