
/**
 * Generare in modo casuale un numero tra 1 e 100 , l'utente ha 5 tentativi per indovinarlo , dare anche indizi 
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import java.util.*;
import java.io.*;
import java.math.*;
public class IndovinaIlNumero{
    public static void main(String[]args){
        int randomNumber = (int)(Math.random()*100);
        int n=0,i=0;
        Scanner inp = new Scanner (System.in);
        System.out.println("Questo gioco consiste nel indovinare un numero generato casualmente tra 1 e 100, hai 5 tentativi");
        while (n != randomNumber && i<5){
            System.out.println("Prova ad indovinare");
            n=inp.nextInt();
            if (n == randomNumber){
                System.out.println("Hai indovinato, bravo!");
            }
            else{
                System.out.println("Hai sbagliato , riprova!");
                if (n > randomNumber){
                    System.out.println("Il numero da indovinare è piu basso");    
                }
                else{
                    System.out.println("Il numero da indovinare è piu alto");
                }
            }
            i++;
        }
        if(n != randomNumber){
            System.out.println("Hai superato i 5 tentativi, il numero da indovinare era "+randomNumber);    
        }
    }
}

