
/**
 * Aggiungi qui una descrizione della classe Es_3A
 * 
 * @author (Davide Cortella) 
 * @version 1:0
 */
import javax.swing.*;
public class Es_3A{
    public static void main (String args[]){
        int n;
        int r=10;
        n= Integer.parseInt(JOptionPane.showInputDialog("dimmi un numero"));
        if(n%2==0){
            n= n%r;
        }
        System.out.println("l'ultima cifra del numero è:"+n);
    }
}

