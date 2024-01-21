
/**
 * Letta una temperatura dire se c'è freddo (<10) fresco(tra 10 e minore di 20) caldo(tra 20 e 29)molto caldo(più di 29); la temperatura non deve essere minore di -50 e maggiore di 50
 * @author (Davide Cortella) 
 * @version (1:0)
 */
import java.util.*;
import java.io.*;
public class Temperatura{
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



