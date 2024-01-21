
/**
 * Letti n numeri double restituirne il prodotto dei valori positivi 
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import java.util.*;
import java.io.*;
public class ProdottoNumeriDouble{
    public static void main(String[]args){
        int n,i=0;
        double v,p=1;
        Scanner inp = new Scanner (System.in);
        System.out.println("Eseguo il prodotto dei numeri positivi inseriti");
        do{
            System.out.println("Quanti valori vuoi inserire?");
            n = inp.nextInt();
        }while(n<2 || n>=10);
        for (i=0 ; i<n ; i++){
            System.out.println("Inserisci valore");
            v = inp.nextDouble();
            if(v>0){
                p = p * v;
            }
        }
        System.out.println("Il prodotto dei valori positivi è "+p);
    }
}
