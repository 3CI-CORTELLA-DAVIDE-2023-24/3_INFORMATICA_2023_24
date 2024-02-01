
/**
 * Leggere un valore l compreso tra 3 e 10
   leggere un vettore di l valori double corrispondenti ai voti di un alunno (voto compreso tra 3 e 10)
   calcolare e visualizzare la media dei voti
   dire se l'alunno è promosso o bocciato
   visualizzare il voto più basso e il voto più alto
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
import java.util.*;
import java.io.*;
public class ArrayPromossoBocciato{
    public static void main(String[]args){
        int l,i;
        double voti[],somma=0.0,media=0.0,votopiùalto=0.0,votopiùbasso=10;
        do{
        l=Integer.parseInt(JOptionPane.showInputDialog("dimmi un valore , compreso tra 3 e 10"));
        }while(l<3||l>10);
        voti=new double[l];
        for(i=0;i<l;i++){
            do{
                voti[i]=Double.parseDouble(JOptionPane.showInputDialog("dimmi un nuovo voto"));
            }while(voti[i]<3||voti[i]>10);
            somma=somma+voti[i];
            media=somma/l;
            if(voti[i]>votopiùalto){
                votopiùalto=voti[i];
            }else if(voti[i]<votopiùbasso){
                votopiùbasso=voti[i];
            }
        }
        System.out.println("la media dei voti è : " +media);
        if(media>=6.0){
            System.out.println("l'alunno è promosso");
        }else{
            System.out.println("l'alunno è bocciato");
        }
            System.out.println("il voto più alto è: "+votopiùalto);
            System.out.println("il voto più basso è: "+votopiùbasso);
            
    }
}

