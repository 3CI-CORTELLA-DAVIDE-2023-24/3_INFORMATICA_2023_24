
/**
 * Presa una stringa, separare ogni carattere con un trattino
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
public class CaratteriConTrattino{
    public static void main(String args[]){
        String Parola;
        int i ;
        do{
            Parola=JOptionPane.showInputDialog("dimmi la parola");
        }while(Parola.length()<0);
        for(i=0;i<Parola.length();i++){
        System.out.print(Parola.charAt(i));
        if(i<(Parola.length())-1){
            System.out.print("-");
        }      
    }
    }
}

 

