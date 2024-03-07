
/**
 * Leggere un valore n >3
Leggere un vettore di n stringhe
Creare una stringa contenente tutte le stringhe del vettore concatenate divise da uno spazio
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class Es2{
    public static void main(String[]args){
        int n,i;
        String vettore[];
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("dimmi un valore,maggiore di 3"));
        }while(n<=3);
        vettore=new String[n];
        for(i=0;i<n;i++){
            vettore[i]=JOptionPane.showInputDialog("dimmi una nuova stringa");
            System.out.print(vettore[i]+ " ");
        }
    }
}


