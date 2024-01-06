
/**
 * Aggiungi qui una descrizione della classe Es_01
 * 
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import javax.swing.*;
public class Es_01{
    public static void main(String[]args){
        int gg;
        int mm;
        int aa;
        int gtrascorsi;
        gg=Integer.parseInt(JOptionPane.showInputDialog("dimmi il giorno:"));
        mm=Integer.parseInt(JOptionPane.showInputDialog("dimmi il mese:"));
        aaaa=Integer.parseInt(JOptionPane.showInputDialog("dimmi l'anno:"));
        if(((0<gg && gg<32) && (mm==01|| mm==03||mm==05||mm==07||mm==10||mm==12|mm==08))||((0<gg && gg<=30) && (mm==11||mm==04||mm==06|| mm==09))||((0<gg && gg<=29)&&(mm==02)&&(aaaa%4==0 && aaaa%100 !=0))){
            System.out.println("è un anno ammissibile");
        }else{
            System.out.println("non è un anno ammissibile");
         }
        
        gtrascorsi=gg;
        if(data.equals("è un anno ammissibile")){
            do{
                mm=mm-1;
                if((mm==4 || mm==6 ||mm=9 || mm=11)){
                    gtrascorsi=gtrascorsi+30;
                }else if((anno% 4==0) && (mm=02)){
                    gtrascorsi=gtrascorsi+29;
                }else if((anno%4!=0) && (mm=02)){
                    gtrascorsi=gtrascorsi+28;
                }else{
                    gtrascorsi=gtrascorsi+31;
                }
            }while(mm>1);
        }
        System.out.println("dall'inizio dell'anno sono trascorsi "+gtrascorsi+"giorni");
    }
}
        
        
        
    

