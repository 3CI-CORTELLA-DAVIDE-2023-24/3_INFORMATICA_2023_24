
/**
 * Scrivere un programma per eliminare la lettera ‘a’ da una stringa.
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class StringaSenzaA{
    public static void main(String[]args){
        String parola=JOptionPane.showInputDialog("dimmi una parola");
        int i;
        for(i=0;i<= parola.length()-1;i++){
            char carattere =parola.charAt(i);
            String Conv = Character.toString(carattere);
            if(Conv.equals("a")){
                System.out.print("");
            }else{
                System.out.println(Conv);
        }
    }
    }   
}
