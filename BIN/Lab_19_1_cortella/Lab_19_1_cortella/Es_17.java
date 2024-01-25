
/**
 * Letti una stringa e un carattere, dire qual è la prima posizione della stringa in cui compare
quel carattere. Se esso non c’è, restituire -1.
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class Es_17{
    public static void main(String[]args){
        String parola=JOptionPane.showInputDialog("dimmi una parola");
        String carattere=JOptionPane.showInputDialog("dimmi un carattere");
        int i;
        boolean carattere_presente=false;
        for(i=0;i<=parola.length()-1;i++){
            char lettera=parola.charAt(i);
            String Conv=Character.toString(lettera);
            if(Conv.equals(carattere)){
                System.out.println(parola.indexOf(Conv));
                carattere_presente=true;
            }else{
                carattere_presente=false;
            }
        }
        if(carattere_presente=false){
            System.out.println("-1");
        }
    }
}
                
