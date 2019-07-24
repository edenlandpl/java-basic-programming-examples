package szkoleniejava01;

/**
 *
 * @author Adrian
 */
// tworzymy nową klasę i przeciążamy metodę getMessage, aby mieć własne komunikaty
public class WyjatkiKalkulator extends Exception{
    @Override
    public String getMessage(){
        //System.err.println("Błąd dzielenia przez zero");
        return "Błąd dzielenia przez zero";
    }

    
}
