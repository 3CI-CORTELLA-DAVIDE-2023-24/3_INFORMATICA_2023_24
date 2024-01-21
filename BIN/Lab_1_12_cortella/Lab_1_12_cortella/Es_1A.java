
/**
 * Aggiungi qui una descrizione della classe Lab_1_12
 * 
 * @author (Davide Cortella) 
 * @version 1:0
 */
import javax.swing.*;
public class Es_1A{
    public static void main(String[] args ){
        int p;
        do{
         p=Integer.parseInt(JOptionPane.showInputDialog("dimmi il prezzo"));
        }while(p<=0);
        if(p<=10){
            System.out.println("il prodotto è economico");
        }
        if(p>10 && p<=50){
        System.out.println("il prodotto è regolare");
        }
        if(p>50){
            System.out.println("il prodotto è regolare");
        }
        
    }
}


