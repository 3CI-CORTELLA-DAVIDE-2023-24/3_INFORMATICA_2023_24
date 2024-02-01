
/**
 * Leggere un vettore di l valori interi, vedi esercizio 1, leggere un valore intero k e dire se il valore è presente nel vettore 
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;

public class Es_03{
    public static void main(String[]args){
        int v[],k,i=0,l;
        l=Integer.parseInt(JOptionPane.showInputDialog("dimmi quanti valori vuoi" ));
        v=new int[l];
        k=Integer.parseInt(JOptionPane.showInputDialog("dimmi un valore di k" ));
        for(i=0;i<l;i++){
            v[i]=Integer.parseInt(JOptionPane.showInputDialog("dimmi un nuovo valore" ));
            if(v[i]==k){
                System.out.println("il valore è presente nel vettore");
            }else{
                System.out.println("il valore non è presente nel vettore");
            }
        }
    }
}

