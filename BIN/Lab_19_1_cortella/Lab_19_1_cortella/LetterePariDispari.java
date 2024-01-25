
/**
 * Scrivere un programma che, letta una parola, ne restituisca un'altra data da tutte le lettere
in posizione pari seguite da tutte le lettere in posizione dispari della prima parola.
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class LetterePariDispari{
    public static void main(String[]args){
        String parola=JOptionPane.showInputDialog("dimmi una parola");
        int i;
        for(i=0;i<=parola.length()-1;i++){
            char carattere =parola.charAt(i);
            String Conv=Character.toString(carattere);
            if(i%2==0){
                System.out.print(Conv);
            }
        }
        System.out.print("");
        for( i= 0;i<=parola.length()-1;i++){
            char carattere=parola.charAt(i);
            String Conv= Character.toString(carattere);
            if(i%2!=0){
                System.out.print(Conv);
            }
        }
    }
}
