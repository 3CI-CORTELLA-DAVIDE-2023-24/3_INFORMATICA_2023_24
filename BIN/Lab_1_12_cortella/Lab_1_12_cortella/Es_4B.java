
/**
 * Aggiungi qui una descrizione della classe Es_4B
 * 
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import java.util.*;
import java.io.*;
public class Es_4B{
    public static void main(String[]args){
        int n = 21 , i = 0;
        Scanner inp = new Scanner (System.in);
        System.out.println("Stampo la tabellina del 21: ");
        for (i=0 ; i<10 ; i++){
            System.out.println(n);
            n = n + 21;
        }
    }
}