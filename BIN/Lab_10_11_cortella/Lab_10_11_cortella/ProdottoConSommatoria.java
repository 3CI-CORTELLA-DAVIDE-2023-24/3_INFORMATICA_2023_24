package Lab_10_11_cortella;


/**
 * Calcolare il prodotto di 2 valori interi e positivi  utilizzando la sommatoria 
 * @author Davide Cortella 
 * @version 1:0
 */
import javax.swing.*;
public class ProdottoConSommatoria{
    public static void main (String[]args){
        int n, volte, somma , prodotto, risultato=0;
        n =Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero"));
        prodotto =Integer.parseInt(JOptionPane.showInputDialog(" dimmi per quanto vuoi moltiplicare questo numero"));
        
        for(volte=0; volte<prodotto;volte++){
            risultato=n+risultato;
        }
        
        System.out.println("il risultato è : "+risultato);
        
        
    }
}

