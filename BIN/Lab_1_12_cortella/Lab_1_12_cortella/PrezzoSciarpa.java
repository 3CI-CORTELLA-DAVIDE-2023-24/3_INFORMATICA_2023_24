
/**
 * Letto il prezzo di una sciarpa , dire se è un prodotto economico (fino a 10 euro), regolare(superiore ai 10)o di lusso (superiore a 50)
 * @author (Davide Cortella) 
 * @version 1:0
 */
import javax.swing.*;
public class PrezzoSciarpa{
    public static void main(String[] args ){
        int p;
        do{
         p=Integer.parseInt(JOptionPane.showInputDialog("dimmi il prezzo"));
        }while(p<=0);
        if(p<=10){
            System.out.println("il prodotto è economico");
        }
        else if(p>10 && p<=50){
        System.out.println("il prodotto è regolare");
        }
        else(p>50){
            System.out.println("il prodotto è regolare");
        }
        
    }
}


