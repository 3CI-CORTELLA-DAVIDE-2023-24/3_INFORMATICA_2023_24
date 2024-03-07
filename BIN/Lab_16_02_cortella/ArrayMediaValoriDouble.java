
/**
 * Leggere un vettore di n valori double
calcolare la media eliminando il valore più grande
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class ArrayMediaValoriDouble{
    public static void main(String[]args){
        int i ,n;
        double vettore[],valore,somma =0.0 ,media=0.0, massimo=0.0;
        n=Integer.parseInt(JOptionPane.showInputDialog("dimmi quanti valori ci sono"));
        vettore=new double [n];
        for(i=0;i<n;i++){
            vettore[i]=Integer.parseInt(JOptionPane.showInputDialog("dimmi un nuovo valore"));
            somma=somma+vettore[i];
            if(vettore[i]>massimo){
                vettore[i]=massimo;
            }
        }
        media=somma-massimo/n-1;
        System.out.println(media);
    }
}

