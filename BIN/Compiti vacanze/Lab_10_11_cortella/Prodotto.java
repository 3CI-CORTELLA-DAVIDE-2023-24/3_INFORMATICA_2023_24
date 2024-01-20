package Lab_10_11_cortella;


/**
 * Calcolare e visualizzare  il prodotto di n valori interi
 * @author Cortella Davide 
 * @version 1:0
 */
import javax.swing.JOptionPane;
public class Prodotto{
    public static void main(String args[]){
        int val1,val2,i,prod;
        n=2;
        prod=0;
        do{
            val1=Integer.parseInt(JOptionPane.showInputDialog("dimmi quante volte vuoi sommare b"));     
        }while(a<1);
        for(i=0;i<val1;i++){
            do{
                val2=Integer.parseInt(JOptionPane.showInputDialog("inserisci il fattore di moltiplicazione"));

            }while(val2<1);
            prod=prod+val2;
        }
        System.out.println ("il prodotto è:"+prod);
    }
}

            
        
        
        
        
    

    
