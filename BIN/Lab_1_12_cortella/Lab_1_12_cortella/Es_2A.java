
/**
 * Aggiungi qui una descrizione della classe Es_2A
 * 
 * @author (Davide Cortella) 
 * @version 1:0
 */
import javax.swing.*;
public class Es_2A{
    public static void main(String []args){
        int n;
        int v;
        int somma=0;
        int i;
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("dimmi il numero di n"));
        }while(n<=3 || n>=14);
        for(i=0;i<n;i++){
            v=Integer.parseInt(JOptionPane.showInputDialog(" dimmi il valore di n"));
            if(v%2==0){
                somma=somma+v;
            }
        }
    System.out.println(+somma);
}
}

    
