/**
 * Crea la classe ContoCorrente
 * @author Davide Cortella
 * @version 1.0
 */
public class ContoCorrenteTest{
  public static void main(String[]args){
    ContoCorrente c1;
    ContoCorrente c2;
    ContoCorrente c3;
    c1=new ContoCorrente();
    c1.setNumConto(1);
    c1.setsaldo(100.0);
    c2=new ContoCorrente(2,150.0);
    c2.setNumConto(2);
    c2.setsaldo(150.0);
    c3=new ContoCorrente(c2);
    System.out.println(c1.toString);
    System.out.println(c2.toString);
    System.out.println(c2.toString);
    
    
    
  
