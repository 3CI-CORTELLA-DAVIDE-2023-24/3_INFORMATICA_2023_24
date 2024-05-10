/**
 * Crea la classe ContoCorrente
 * @author Davide Cortella
 * @version 1.0
 */
public class ContoCorrente{
  public ContoCorrente(){
       this.NumConto=0;
       this.saldo=0.0;
  }
  public void(int nC,double s){
        if(nC>0){
          this.NumConto=nC;
        }
          this.saldo=s;
  }
  public ContoCorrente(ContoCorrente c){
          if(c!=null){
                this.NumConto=c.NumConto;
                this.saldo=c.saldo;
            }else{
                this.NumConto=0;
                this.saldo=0.0;
            }
  }
  public void setNumConto(int n) {
          if(n>0){
            this.NumConto=n;
            }
  }
  public void setSaldo(double s){
            this.saldo=s;
            }
  public int getNumConto(){
                return NumConto;
            }
  public double getSaldo(){
       return Saldo;
     }
  public String toString(){
    String out="";
    out+="Il tuo numero del conto è" +this.NumConto +"\n" ;
         out +="Il tuo saldo è " +this.saldo;
         return out;
        }
    }




