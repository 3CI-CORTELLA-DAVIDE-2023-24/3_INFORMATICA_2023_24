package Lab_10_11_cortella;


/**
 * Calcolare e visualizzare  il prodotto di n valori interi
 * @author Cortella Davide 
 * @version 1:0
 */
import javax.swing.JOptionPane;
public class Es_02{
    public static void main(String args[]){
        int a,b,n,i,prod;
        n=2;
        prod=0;
        do{
            a=Integer.parseInt(JOptionPane.showInputDialog("dimmi quante volte vuoi sommare b"));     
        }while(a<1);
        for(i=0;i<a;i++){
            do{
                b=Integer.parseInt(JOptionPane.showInputDialog("inserisci il fattore di moltiplicazione"));

            }while(b<1);
            prod=prod+b;
        }
        System.out.println ("il prodotto è:"+prod);
    }
}

            
        
        
        
        
    

    
