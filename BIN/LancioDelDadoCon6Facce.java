* questo programma  genera 10 numeri casuali da 1 a 6 simulando un lancio del dado con 6 facce
* Davide Cortella
* 1.0
import Java.util.Random;
public class LancioDelDado{
  public static void main(String[]args){
    int d;
    Random generator=new Random();
    for(int i=1;i<=10;i++){
      d=1+ generator.nextInt(6);
      System.out.print(d+"");
    }
    System.out.println();
  }   
}
