
/**
 * Scrivere un programma che, letta una parola, sostituisca tutte le vocali con un asterisco.
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class VocaliAsterisco{
    public static void main(String[]args){
        String parola=JOptionPane.showInputDialog("dimmi una parola");
        int i;
        for(i=0;i<=parola.length()-1;i++){
            char carattere =parola.charAt(i);
            String Conv=Character.toString(carattere);
            if(Conv.equals("a")|| Conv.equals("e")||Conv.equals("i")|| Conv.equals("o")||Conv.equals("u")){
                System.out.print("*");
            }else{
                System.out.print(Conv);
            }
        }    
    }
}    
