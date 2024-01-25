
/**
 * Dato un indirizzo email, estrarre il dominio, cioè tutto ciò che segue il simbolo @
( mross@ studenti.marconiverona.edu.it → studenti.marconiverona.edu.it )
 * @author Davide Cortella 
 * @version 1.0
 */
import javax.swing.*;
public class DominioEmail{
    public static void main(String[]args){
        String Email=JOptionPane.showInputDialog("dimmi la tua mail");
        char C1;
        String Dominio="";
        int i;
        for(i=0; i< Email.length();i++){
            C1=Email.charAt(i);
            String Conversione =Character.toString(C1);
            if(Conversione.equals("@")){
                Dominio=Email.substring(Email.indexOf("@")+1);
                i= Email.length()+1;
            }  
        }
        System.out.println("il dominio è "+Dominio);
    }
}

