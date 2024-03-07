
/**
 * Leggere un valore n >3
   Leggere un vettore di n valori interi
   visualizzare i valori pari
   sommare i valori in posizione dispari
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class SommaValoriPariArray{
    public static void main(String[]args){
        int n,vettore[],sommapd=0;
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("dimmi il valore n"));
        }while(n<=3);
        vettore=new int[n];

        for(int i=0;i<n;i++){
            vettore[i]=Integer.parseInt(JOptionPane.showInputDialog("dimmi un valore del vettore"));
        }
        for(int i=0;i<n;i++){
            if(vettore[i]%2==0){
                    System.out.println(vettore[i]);
                }
            if(i%2!=0){
                    sommapd+=vettore[i]; 
                }
            
        }   
    System.out.println("la somma dei vettori dispari è :" +sommapd);  
}
    
}

