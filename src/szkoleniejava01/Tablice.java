package szkoleniejava01;

/**
 *
 * @author Adrian
 */
public class Tablice {
    @SuppressWarnings("empty-statement")
    public void Tablice(){
    int[] tablica = new int[9]; 
    
    char[] tablicaZ = {'d','f','e','w','r','y','w','r','d','d','d'};
    char[] tablicaDo = new char[7];
    
    System.arraycopy(tablicaZ , 2, tablicaDo, 0, 4);    // kopiowaie tablicy do tablicy 4 ilośc znaków
    System.out.println(new String(tablicaDo));          // tworzenie String z tablicy
    
    char[] tablicaDo01 = java.util.Arrays.copyOfRange(tablicaZ, 2, 9); // kopiuje tablice do nowej od .. do
    System.out.println(new String(tablicaDo01)); 
    
    int tab[][] = new int[4][5]; 
    
    for (int i=0; i<4; i++)
    {
        for(int j=0 ; j<5 ; j++){
            tab[i][j] = i;
            System.out.print(tab[i][j] + " ");
        }
        System.out.print("\n");
    }    
    
    // for each - tylko odczytywanie pętli, brak możliwości zapisania
    // czytanie kolejne elementy, wszystkie po kolei
    // niebezpieczna, ponieważ nie daje kontroli nad zawartością tablicy
    
    int [][] numbers = {{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}}; // wyświetlanie tablicy 2 wymiarowej, dlatego krzaki
    
    
    for (int[] item : numbers)
    {
        System.out.println("Liczba to : " + item);
    }
    
    }       
}
