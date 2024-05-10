/**
 * Crea il codice fiscale
 * @author Davide Cortella
 * @version 1.0
 */
import javax.swing.*;
public class CodiceFiscale{
    public static void main(String[] args){
        
        String Cognome = JOptionPane.showInputDialog("Insersci il tuo cognome: ");
        Cognome = Cognome.toUpperCase();
        String Nome = JOptionPane.showInputDialog("Insersci il tuo nome. ");
        Nome = Nome.toUpperCase();
        String Annodinascita = JOptionPane.showInputDialog("Insersci il tuo anno di nascita: ");
        String Mesedinascita = JOptionPane.showInputDialog("Insersci il tuo mese di nascita: ");
        int Giornodinascita = Integer.parseInt(JOptionPane.showInputDialog("Insersci il tuo giorno di nascita: "));
        String Sesso = JOptionPane.showInputDialog("Insersci il tuo sesso M/F: ");
        Sesso = Sesso.toUpperCase();
        String Cf = "";
        int c = 0;
        int somma = 0;
        int resto = 0;
        
        for(int i = 0; i < Cognome.length(); i++){
            
            char lettera = Cognome.charAt(i);
            String Conversione = Character.toString(lettera);
            
            if(Conversione.equals("A")){
                
            }else if(Conversione.equals("E")){
                
            }else if(Conversione.equals("I")){
                
            }else if(Conversione.equals("O")){
                
            }else if(Conversione.equals("U")){
                
            }else{
                Cf = Cf + Conversione;
                c++;
            }
            
            if(c == 3){
                i = Cognome.length() +1;
            }
            
        }
        
        for(int i = 0; i < Nome.length(); i++){
            
            char lettera = Nome.charAt(i);
            String Conversione = Character.toString(lettera);
            
            if(Conversione.equals("A")){
                
            }else if(Conversione.equals("E")){
                
            }else if(Conversione.equals("I")){
                
            }else if(Conversione.equals("O")){
                
            }else if(Conversione.equals("U")){
                
            }else{
                Cf = Cf + Conversione;
                c++;
                if(c == 1){
                    i=i+2;
                }
            }
            
            if(c == 3){
                i = Nome.length() +1;
            }
            
        }
        
        Cf = Cf + Annodinascita.substring(Annodinascita.length() - 2);
        
        if(Mesedinascita.equals("gennaio")){
            Cf = Cf + "A";
            
        }else if(Mesedinascita.equals("febbraio")){
            Cf = Cf + "B";
            
        }else if(Mesedinascita.equals("marzo")){
            Cf = Cf + "C";
            
        }else if(Mesedinascita.equals("aprile")){
            Cf = Cf + "D";
            
        }else if(Mesedinascita.equals("maggio")){
            Cf = Cf + "E";
            
        }else if(Mesedinascita.equals("giugno")){
            Cf = Cf + "H";
            
        }else if(Mesedinascita.equals("luglio")){
            Cf = Cf + "L";
            
        }else if(Mesedinascita.equals("agosto")){
            Cf = Cf + "M";
            
        }else if(Mesedinascita.equals("settembre")){
            Cf = Cf + "P";
            
        }else if(Mesedinascita.equals("ottobre")){
            Cf = Cf + "R";
            
        }else if(Mesedinascita.equals("novembre")){
            Cf = Cf + "S";
            
        }else if(Mesedinascita.equals("dicembre")){
            Cf = Cf + "T";
            
        }
        
        if(Sesso.equals("M")){
            Cf = Cf + "0" +Giornodinascita;
            
        }else{
            Cf = Cf + Giornodinascita + 40;
            
        }
        
        Cf = Cf + "L781";
        
        for(int i = 0; i < Cf.length(); i++){
            
            char carattere = Cf.charAt(i);
            String Conversione = Character.toString(carattere);
            
            if(i % 2 == 0){
                if(Conversione.equals("0")){
                    somma = somma + 0 ;
                }else if(Conversione.equals("1")){
                    somma = somma + 1 ;
                }else if(Conversione.equals("2")){
                    somma = somma + 2 ;
                }else if(Conversione.equals("3")){
                    somma = somma + 3 ;
                }else if(Conversione.equals("4")){
                    somma = somma + 4 ;
                }else if(Conversione.equals("5")){
                    somma = somma + 5 ;
                }else if(Conversione.equals("6")){
                    somma = somma + 6 ;
                }else if(Conversione.equals("7")){
                    somma = somma + 7 ;
                }else if(Conversione.equals("8")){
                    somma = somma + 8 ;
                }else if(Conversione.equals("9")){
                    somma = somma + 9 ;
                }else if(Conversione.equals("A")){
                    somma = somma + 0 ;
                }else if(Conversione.equals("B")){
                    somma = somma + 1 ;
                }else if(Conversione.equals("C")){
                    somma = somma + 2 ;
                }else if(Conversione.equals("D")){
                    somma = somma + 3 ;
                }else if(Conversione.equals("E")){
                    somma = somma + 4 ;
                }else if(Conversione.equals("F")){
                    somma = somma + 5 ;
                }else if(Conversione.equals("G")){
                    somma = somma + 6 ;
                }else if(Conversione.equals("H")){
                    somma = somma + 7 ;
                }else if(Conversione.equals("I")){
                    somma = somma + 8 ;
                }else if(Conversione.equals("J")){
                    somma = somma + 9 ;
                }else if(Conversione.equals("K")){
                    somma = somma + 10 ;
                }else if(Conversione.equals("L")){
                    somma = somma + 11 ;
                }else if(Conversione.equals("M")){
                    somma = somma + 12 ;
                }else if(Conversione.equals("N")){
                    somma = somma + 13 ;
                }else if(Conversione.equals("O")){
                    somma = somma + 14 ;
                }else if(Conversione.equals("P")){
                    somma = somma + 15 ;
                }else if(Conversione.equals("Q")){
                    somma = somma + 16 ;
                }else if(Conversione.equals("R")){
                    somma = somma + 17 ;
                }else if(Conversione.equals("S")){
                    somma = somma + 18 ;
                }else if(Conversione.equals("T")){
                    somma = somma + 19 ;
                }else if(Conversione.equals("U")){
                    somma = somma + 20 ;
                }else if(Conversione.equals("V")){
                    somma = somma + 21 ;
                }else if(Conversione.equals("W")){
                    somma = somma + 22 ;
                }else if(Conversione.equals("X")){
                    somma = somma + 23 ;
                }else if(Conversione.equals("Y")){
                    somma = somma + 24 ;
                }else if(Conversione.equals("Z")){
                    somma = somma + 25 ;
                }
            }else{
                
                if(Conversione.equals("0")){
                    somma = somma + 1 ;
                }else if(Conversione.equals("1")){
                    somma = somma + 0 ;
                }else if(Conversione.equals("2")){
                    somma = somma + 5 ;
                }else if(Conversione.equals("3")){
                    somma = somma + 7 ;
                }else if(Conversione.equals("4")){
                    somma = somma + 9 ;
                }else if(Conversione.equals("5")){
                    somma = somma + 13 ;
                }else if(Conversione.equals("6")){
                    somma = somma + 15 ;
                }else if(Conversione.equals("7")){
                    somma = somma + 17 ;
                }else if(Conversione.equals("8")){
                    somma = somma + 19 ;
                }else if(Conversione.equals("9")){
                    somma = somma + 21 ;
                }else if(Conversione.equals("A")){
                    somma = somma + 1 ;
                }else if(Conversione.equals("B")){
                    somma = somma + 0 ;
                }else if(Conversione.equals("C")){
                    somma = somma + 5 ;
                }else if(Conversione.equals("D")){
                    somma = somma + 7 ;
                }else if(Conversione.equals("E")){
                    somma = somma + 9 ;
                }else if(Conversione.equals("F")){
                    somma = somma + 13 ;
                }else if(Conversione.equals("G")){
                    somma = somma + 15 ;
                }else if(Conversione.equals("H")){
                    somma = somma + 17 ;
                }else if(Conversione.equals("I")){
                    somma = somma + 19 ;
                }else if(Conversione.equals("J")){
                    somma = somma + 21 ;
                }else if(Conversione.equals("K")){
                    somma = somma + 2 ;
                }else if(Conversione.equals("L")){
                    somma = somma + 4 ;
                }else if(Conversione.equals("M")){
                    somma = somma + 18 ;
                }else if(Conversione.equals("N")){
                    somma = somma + 20 ;
                }else if(Conversione.equals("O")){
                    somma = somma + 11 ;
                }else if(Conversione.equals("P")){
                    somma = somma + 3 ;
                }else if(Conversione.equals("Q")){
                    somma = somma + 6 ;
                }else if(Conversione.equals("R")){
                    somma = somma + 8 ;
                }else if(Conversione.equals("S")){
                    somma = somma + 12 ;
                }else if(Conversione.equals("T")){
                    somma = somma + 14 ;
                }else if(Conversione.equals("U")){
                    somma = somma + 16 ;
                }else if(Conversione.equals("V")){
                    somma = somma + 10 ;
                }else if(Conversione.equals("W")){
                    somma = somma + 22 ;
                }else if(Conversione.equals("X")){
                    somma = somma + 25 ;
                }else if(Conversione.equals("Y")){
                    somma = somma + 24 ;
                }else if(Conversione.equals("Z")){
                    somma = somma + 23 ;
                }
                
            }
        }
        
        resto = somma % 26;
        
        switch (resto){
            case 0:
                Cf = Cf + "A";
                break;
            case 1:
                Cf = Cf + "B";
                break;
            case 2:
                Cf = Cf + "C";
                break;
            case 3:
                Cf = Cf + "D";
                break;
            case 4:
                Cf = Cf + "E";
                break;
            case 5:
                Cf = Cf + "F";
                break;
            case 6:
                Cf = Cf + "G";
                break;
            case 7:
                Cf = Cf + "H";
                break;
            case 8:
                Cf = Cf + "I";
                break;
            case 9:
                Cf = Cf + "J";
                break;
            case 10:
                Cf = Cf + "K";
                break;
            case 11:
                Cf = Cf + "L";
                break;
            case 12:
                Cf = Cf + "M";
                break;
            case 13:
                Cf = Cf + "N";
                break;
            case 14:
                Cf = Cf + "O";
                break;
            case 15:
                Cf = Cf + "P";
                break;
            case 16:
                Cf = Cf + "Q";
                break;
            case 17:
                Cf = Cf + "R";
                break;
            case 18:
                Cf = Cf + "S";
                break;
            case 19:
                Cf = Cf + "T";
                break;
            case 20:
                Cf = Cf + "U";
                break;
            case 21:
                Cf = Cf + "V";
                break;
            case 22:
                Cf = Cf + "W";
                break;
            case 23:
                Cf = Cf + "X";
                break;
            case 24:
                Cf = Cf + "Y";
                break;
            case 25:
                Cf = Cf + "Z";
                break;
        }
        
        System.out.println(Cf);
    }
}


