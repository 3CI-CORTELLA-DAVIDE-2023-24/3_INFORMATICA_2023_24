
/**
 * Contare da quanti caratteri è composta una stringa. 
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
public class Es_04{
    public static void main(String[]args){
        String parola=JOptionPane.showInputDialog("dimmi la parola");
        int n,lungh;
        lungh=0;
        for(int i=0;i<parola.length();i++){
            lungh=lungh+1;
            }
        System.out.println("la stringa è composta da :"+lungh);
        }
    }

