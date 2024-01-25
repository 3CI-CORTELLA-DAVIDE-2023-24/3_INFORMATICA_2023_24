
/**
 * Trasformare una stringa in modo che abbia l’iniziale maiuscola e tutte le altre lettere
minuscole.
 * 
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class Es_07{
    public static void main(String[]args){
        String parola=JOptionPane.showInputDialog("dimmi la parola");
        char Primalettera= parola.charAt(0);
        String Conversione= Character.toString(Primalettera );
        String PrimaletteraMaiuscola=Conversione.toUpperCase();
        String Restoparola=parola.substring(1);
        String RestoparolaMinuscola =Restoparola.toLowerCase();
        System.out.print(PrimaletteraMaiuscola+RestoparolaMinuscola);
        
    }
}

