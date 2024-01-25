
/**
 * Letti una stringa e un carattere, dire se quella stringa contiene quel carattere.
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
public class CarattereNellaStringa{
    public static void main(String[]args){
        String parola=JOptionPane.showInputDialog("dimmi una parola");
        String carattere=JOptionPane.showInputDialog("dimmi un carattere");
        int i;
        for(i=0;i<=parola.length()-1;i++){
            char lettera =parola.charAt(i);
            String Conv =Character.toString(lettera);
            if(Conv.equals(carattere)){
                System.out.println("la parola contiene il carattere"+carattere);
                i=parola.length()+1;
            }
        }
    }
}
