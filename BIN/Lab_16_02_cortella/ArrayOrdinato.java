
/**
 * Ordinare un vettore letto precedentemente 
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
public class ArrayOrdinato{
    public static void main(String[]args){
        int vettore[],i,t,k,nvalori;
        nvalori=Integer.parseInt(JOptionPane.showInputDialog("dimmi quanti valori ci sono"));
        vettore=new int[nvalori];
        for(i=0;i<nvalori;i++){
            vettore[i]=Integer.parseInt(JOptionPane.showInputDialog("dimmi un nuovo valore del vettore"));
        }
            for(k=0;k<nvalori;k++){
                if(vettore[k]>vettore[k+1]){
                    t=vettore[k];
                    vettore[k]=vettore[k+1];
                    vettore[k+1]=t;
                }
            }
             System.out.println(vettore);
            }
        }
        
        
    


