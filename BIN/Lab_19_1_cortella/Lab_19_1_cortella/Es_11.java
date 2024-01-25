
/**
 * Scrivere un programma che realizzi la r moscia: in una stringa, sostituire tutte le ‘r’ con ‘v’
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
public class Es_11{
    public static void main(String[]args){
        String parola=JOptionPane.showInputDialog("dimmi una parola");
        int i;
        for(i=0;i<=parola.length()-1;i++){
            char carattere=parola.charAt(i);
            String Conv= Character.toString(carattere);
            if(Conv.equals("r")){
                System.out.print("v");
            }else{
                System.out.print(Conv);
            }
        }
    }    
}