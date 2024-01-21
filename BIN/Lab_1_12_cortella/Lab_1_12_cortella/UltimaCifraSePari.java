
/**
 * Visualizzare l'ultima cifra di un numero inserito se pari 
 * @author (Davide Cortella) 
 * @version 1:0
 */
import javax.swing.*;
public class UltimaCifraSePari{
    public static void main (String args[]){
        int n;
        int r=10;
        n= Integer.parseInt(JOptionPane.showInputDialog("dimmi un numero"));
        if(n%2==0){
            n= n%r;
        }
        System.out.println("l'ultima cifra del numero è:"+n);
    }
}

