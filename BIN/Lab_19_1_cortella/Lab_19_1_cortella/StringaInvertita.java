
/**
 * Scrivere un programma per invertire una stringa
 * @author Davide Cortella 
 * @version 1.0
 */
import java.util.*;
import javax.swing.*;
public class StringaInvertita{
    public static void main(String args[]){
        String parola=JOptionPane.showInputDialog("dimmi una parola");
        int i;
        for(i=parola.length()-1;i>=0;i--){
            System.out.println(parola.charAt(i));
        }
    }
}   

