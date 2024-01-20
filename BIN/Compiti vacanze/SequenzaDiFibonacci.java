
/**
 * Sequenza di Fibonacci
 * Preso in ingresso 2 visualizza Fibn
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import javax.swing.*;
public class SequenzaDiFibonacci{
    public static void main(String []args){
        int nfib;
        int fib0=0;
        int fib1=1;
        int ris=0;
        int i;
        do{
            nfib=Integer.parseInt(JOptionPane.showInputDialog("dimmi il numero di fibonacci:"));
        }while(nfib<1);
        System.out.println(fib1+fib0);
        for( i=nfib; i>=2; i--){
            ris= fib0+fib1;
            
            fib0=fib1;
            fib1=ris;
        }
        System.out.println(+ris);
          
    }
}

