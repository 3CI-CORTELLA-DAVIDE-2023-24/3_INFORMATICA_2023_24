* Calcolare area del cerchio con PI_GRECO come costante
* Davide Cortella
* version 1.0
Import javax.swing.*;
public class AreaCerchioConCostante{
  public static void main(String[]args){
    double area;
    double raggio;
    final double PI_GRECO=3.14;
    do{
       raggio=Double.parseDouble(JOptionPane.showInputDialog("dammi il raggio"));
    }while(raggio<0.0);
    area=PI_GRECO*raggio*raggio;
    System.out.println("la superficie del cerchio di raggio"+raggio+"è:"+area);
