
/**
 * Aggiungi qui una descrizione della classe Es_1B
 * 
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import java.util.*;
import java.io.*;
public class Es_1B{
    public static void main(String[]args){
        double temp;
        Scanner inp = new Scanner (System.in);
        do{
            System.out.println("Inserisci temperatura tra -50 e 50");
            temp = inp.nextDouble();
        }while(temp<-50 || temp>50);
        if (temp<10){
            System.out.println("c'è freddo");
        }
        else{
            if (temp>=10 && temp<20){
                System.out.println("c'è fresco");
            }
            else{
                if(temp>=10 && temp<30){
                    System.out.println("c'è caldo");
                }
                else{
                    if(temp>29){
                        System.out.println("c'è molto caldo");
                    }
                }
            }
        }
    } 
}



