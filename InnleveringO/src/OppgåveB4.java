
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class OppgåveB4 {

	public static void main(String[] args) {
		
		String bruttoTxt = showInputDialog("skriv inn brutto");
		
		int brutto = parseInt(bruttoTxt);
		
		double skattProsent = 0.0;
		
		if ((brutto >= 190350) && (brutto <= 267899)) {
			//Trinn 1
			skattProsent = 1.7;
		
		} else if ((brutto >= 267900) && (brutto <= 643799)) {
			//Trinn 2
			skattProsent  = 4.0;
		
		} else if ((brutto >= 643800) && (brutto <= 969199)) {
			//Trinn 3
			skattProsent  = 13.4;
			
		} else if ((brutto >= 969200) && (brutto <= 1999999)) {
			//Trinn 4
			skattProsent  = 16.4;
		
		} else if ((brutto >= 2000000)) {
			//Trinn 5
			skattProsent  = 17.4;
		
		}
		
		double skatt = ((brutto/100)* skattProsent);
		double utbetalt = brutto - skatt;
		
		showMessageDialog(null, "du mp betale " + skatt +"kr i skatt, og  du får " + utbetalt + "kr utbetalt");
			
		} 

	}


