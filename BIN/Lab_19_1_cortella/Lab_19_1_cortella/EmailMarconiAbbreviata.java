
/**
 * Presi un nome ed un cognome, creare l’indirizzo email del marconi, formato dalla prima
lettera del nome e dalle prime quattro del cognome, seguiti da
@studenti.marconiverona.edu.it (mario rossi → mross@ studenti.marconiverona.edu.it )
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
public class EmailMarconiAbbreviata{
    public static void main(String []args){
        String Nome=JOptionPane.showInputDialog("Dimmi il nome");
        String Cognome=JOptionPane.showInputDialog("Dimmi il cognome");
        char nomeabbr= Nome.charAt(0);
        String Cognomeabbr= Cognome.substring(0,4);
        String Email= nomeabbr+Cognomeabbr+"@studenti.marconiverona.edu.it";
        System.out.print(Email);
    }
}
