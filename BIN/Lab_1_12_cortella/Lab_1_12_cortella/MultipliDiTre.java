
/**
 * Stampare i multipli di 3 tra 1 e n inserito dall'utente 
 * @author (Davide Cortella) 
 * @version 1:0
 */
import javax.swing.*;
public class MultipliDITre
{
    public static void main(String [] args){
        int n;
        int i;
        do{
         n=Integer.parseInt(JOptionPane.showInputDialog("Dammi un numero maggiore o uguale a 3:"));
        }
        while(n<=3);
       
        for(i=1;i<n;i++){
            if(i%3==0){
                System.out.println(+i);
            }
        }
       
    }
}




