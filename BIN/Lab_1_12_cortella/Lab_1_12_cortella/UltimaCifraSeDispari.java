
/**
 * Visualizzare  l'ultima cifra di un numero inserito se dispari 
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import java.util.*;
import java.io.*;
public class UltimaCifraSeDispari{
    public static void main(String[]args){
        int n,r;
        Scanner inp = new Scanner (System.in);
        do{
            System.out.println("Inserisci un valore");
            n=inp.nextInt();
        }while (n<1);
        if (n>9 && n<100 && n%2==1){
            r= n-10;
            System.out.println(r);
        }
        else{
            if  (n>99 && n<1000 && n%2==1){
                r= n-100;
                System.out.println(r);
            }
            else{
                if (n>999 && n<10000 && n%2==1){
                r= n-1000;
                System.out.println(r);
                }
                else{
                    System.out.println("Il numero è pari");
                }
            }
        }
    }
}
