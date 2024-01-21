
/**
 * Aggiungi qui una descrizione della classe lab_24_11
 * 
 * @author (Davide Cortella) 
 * @version 1:0
 */
import javax.swing.*;
public class es5_A{
    public static void main(String [] args){
        int n1;
        int n2;
        int divisore = 2;
        int v1 = 0;
        int v2 = 0;
        int numeroiniz2=284;
        int numeroiniz1=220;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il primo numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il secondo numero"));
        numeroiniz1 = n1;
        numeroiniz2 = n2;
        while (numeroiniz1>=divisore){
            if(n1 % divisore == 0){
                v1 = v1 + (n1 / divisore);
            }
            divisore = divisore + 1;
        }
        divisore = 2;
        while (numeroiniz2>=divisore){
            if (n2 % divisore == 0){
                v2 = v2 + (n2 / divisore);
            }
            divisore = divisore + 1;
        }
        if (v1==numeroiniz2 && v2==numeroiniz1){
            JOptionPane.showMessageDialog(null, "Il numero "+numeroiniz1+" e il numero "+numeroiniz2+" sono amici");
        }else{
            JOptionPane.showMessageDialog(null, "Il numero "+numeroiniz1+" e il numero "+numeroiniz2+" non sono amici");
        }
    }
}
    


