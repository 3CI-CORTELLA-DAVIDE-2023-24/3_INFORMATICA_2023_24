
/**
 *  Differenza di giorni tra 2 date
 * 
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import javax.swing.*;
public class Differenzadigiornitra2date{
    public static void main(String[]args){
        
        String data1 = "null";
        String data2 = "null";
        int giorno1, mese1, anno1;
        int giorno2, mese2, anno2;
        
        giorno1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il giorno  della prima data"));
        mese1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il mese  della prima data"));
        anno1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'anno della prima data"));
        
        giorno2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il giorno  della seconda data"));
        mese2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il mese  della seconda data"));
        anno2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'anno della seconda data"));
        
        int totgg1 = giorno1;
        int totgg2 = giorno2;
        int anno_minore;
        int anno_maggiore;
        int totdifferenza_anno = 0;
        
        
        if((mese1 < 1 || mese1 > 12) || (giorno1 < 1 || giorno1 > 31)){
            System.out.println("Data 1 errata");
            data1 = "Data errata";
        }else if((mese1 == 4 || mese1 == 6 || mese1 == 9 || mese1 == 11) && giorno1 > 30){
            System.out.println("Data 1 errata");
            data1 = "Data errata";
        }else if((anno1 % 4 == 0) && (mese1 == 2) && (giorno1 > 29)){
            System.out.println("Data 1 errata");
            data1 = "Data errata";
        }else if((anno1 % 4 != 0) && (mese1 == 2) && (giorno1 > 28)){
            System.out.println("Data 1 errata");
            data1 = "Data errata";
        }else{
            System.out.println("Data 1 corretta");
            data1 = "Data corretta";
        }
            if((mese2 < 1 || mese2 > 12) || (giorno2 < 1 || giorno2 > 31)){
            System.out.println("Data 2 errata");
            data2 = "Data errata";
        }else if((mese2 == 4 || mese2 == 6 || mese2 == 9 || mese2 == 11) && giorno2 > 30){
            System.out.println("Data 2 errata");
            data2 = "Data errata";
        }else if((anno2 % 4 == 0) && (mese2 == 2) && (giorno2 > 29)){
            System.out.println("Data 2 errata");
            data2 = "Data errata";
        }else if((anno2 % 4 != 0) && (mese2 == 2) && (giorno2 > 28)){
            System.out.println("Data 2 errata");
            data2 = "Data errata";
        }else{
            System.out.println("Data 2 corretta");
            data2 = "Data corretta";
        }
        if(data1.equals("Data corretta")){
            do{
                mese1 = mese1 - 1;
                if((mese1 == 4 || mese1 == 6 || mese1 == 9 || mese1 == 11)){
                    totgg1 = totgg1 + 30;
                }else if((anno1 % 4 == 0) && (mese1 == 2)){
                    totgg1 = totgg1 + 29;
                }else if((anno1 % 4 != 0) && (mese1 == 2)){
                    totgg1 = totgg1 + 28;
                }else{
                    totgg1 = totgg1 + 31;
                }
            }while(mese1 > 1);
        }
        if(data2.equals("Data corretta")){
            do{
                mese2 = mese2 - 1;
                if((mese2 == 4 || mese2 == 6 || mese2 == 9 || mese2 == 11)){
                    totgg2 = totgg2 + 30;
                }else if((anno2 % 4 == 0) && (mese2 == 2)){
                    totgg2 = totgg2 + 29;
                }else if((anno2 % 4 != 0) && (mese2 == 2)){
                    totgg2 = totgg2 + 28;
                }else{
                    totgg2 = totgg2 + 31;
                }
            }while(mese2 > 1);
        }
        anno_minore = Math.min(anno1, anno2);
        anno_maggiore = Math.max(anno1, anno2);
        while(anno_minore != anno_maggiore){
            if(anno_minore % 4 == 0){
                totdifferenza_anno += 366;
            }else{
                totdifferenza_anno += 365;             
            }
            anno_minore +=1;   
        } 
        System.out.println("Tra le due date intercorrono "+(Math.max(totgg1, totgg2) - Math.min(totgg1, totgg2) + totdifferenza_anno)+" giorni");
        
    }
}
