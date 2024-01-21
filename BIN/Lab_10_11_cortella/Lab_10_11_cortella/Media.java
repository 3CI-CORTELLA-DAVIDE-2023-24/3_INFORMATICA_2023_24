package Lab_10_11_cortella;

/*
 * Questo programma legge un numero di voti e ne calcola la media
 * @author Cortella Davide
 * @version 1.0
 */
import javax.swing.*;
public class Media
{
    public static void main(String [] args){
     int n,i=0;
     double val ,somma=0, media;
     
     do{
         n= Integer.parseInt(JOptionPane.showInputDialog("Quanti voti vuoi inserire? almeno 4 e meno di 20):"));
     }
     while(n<=3||n>=20);
     
         for(i=0;i<n;i++){
             do{
            val=Double.parseDouble(JOptionPane.showInputDialog("Dammi il tuo voto:"));
   
           }while(val<3||val>10);
            somma=somma+val;
         }
     media=somma/n;
     System.out.println("La tua  media  è:"+media);
     if(media>3&&media<6){
         System.out.println("Sei bocciato");
     }
     else
         System.out.println("Sei promosso");
     
 }
}

