
/**
 * Estrarre da una stringa la sottostringa che va dalla posizione a alla posizione b comprese
 * 
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
public class Sottostringa{
    public static void main(String[]args){

        String sottostringa="";
        int a;
        int b;
        String parola=JOptionPane.showInputDialog("inserisci la parola");
        do{
            a=Integer.parseInt(JOptionPane.showInputDialog("dimmi la posizione di a"));
            b=Integer.parseInt(JOptionPane.showInputDialog("dimmi la posizione di b"));
        }while(a<0 && b<0 || a>parola.length() || b>parola.length());
        sottostringa=parola.substring(a,b+1);
        System.out.println(sottostringa);
     }
}
