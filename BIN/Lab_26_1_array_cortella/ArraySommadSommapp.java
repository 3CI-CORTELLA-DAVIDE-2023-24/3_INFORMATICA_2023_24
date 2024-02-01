
/**
 * Leggere un valore l compreso tra 3 e 10
   Leggere un vettore di l elementi interi 
   fare la somma di tutti i valori del vettore e visualizzare la somma
   fare la somma di tutti i valori dispari (sommad) e visualizzare il risultato 
   fare la somma di tutti i valori in posizione pari (sommapp) e visualizzare il risultato
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
import java.util.*;
import java.io.*;

public class ArraySommaSommadSommapp{
    public static void main(String[]args){
        int l;
        int v[];
        int somma=0;
        int i;
        int voti;
        int sommapp=0;
        int sommad=0;
        do{
        l=Integer.parseInt(JOptionPane.showInputDialog("dimmi il numero di valori , compreso tra 3 e 10"));
        }while(l<3||l>10);
        v=new int[l];
        for(i=0;i<l;i++){
            v[i]=Integer.parseInt(JOptionPane.showInputDialog("dimmi i valori"));
            somma+=v[i];
            if(v[i]%2==0){
                sommapp=sommapp+v[i];
            }
            if(v[i]%2!=0){
                sommad=sommad+v[i];
            }
        }
        System.out.println("la somma dei valori è:"+somma);
        System.out.println("la somma dei valori pari è:"+sommapp);
        System.out.println("la somma dei valori dispari è:"+sommad);
        
  }
}


