package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InkomstenBelasting extends Berekening {

    
    public int Belasting = 0;
    public InkomstenBelasting() {
        super();
    }
   
    @Override

    public int berekenBelasting(){
        

        if (gegevens.getTotaalOmzetAfgelopenJaar() <= 20000) {
            Belasting = (int) Math.round(gegevens.getTotaalOmzetAfgelopenJaar() * 0.15);
        } else if (gegevens.getTotaalOmzetAfgelopenJaar() <= 40000) {
            Belasting = (int) Math.round(20000 * 0.15 + (gegevens.getTotaalOmzetAfgelopenJaar() - 20000) * 0.25);
        } else if (gegevens.getTotaalOmzetAfgelopenJaar() <= 60000) {
            Belasting = (int) Math.round(20000 * 0.15 + 20000 * 0.25 + (gegevens.getTotaalOmzetAfgelopenJaar() - 40000) * 0.4);
        } else  {
            Belasting = (int) Math.round(20000 * 0.15 + 20000 * 0.25 + 20000 * 0.4 + (gegevens.getTotaalOmzetAfgelopenJaar() - 60000) * 0.5);
        }
    
        return Belasting;
    }
    

    @Override

    public void toonBelasting(){

        System.out.println("");

        System.out.println("De inkomstenbelasting ziet er als volgt uit: " + "\n" +
        "Totale omzet: " + gegevens.getTotaalOmzetAfgelopenJaar() + "\n" + 
        "Totaal aantal uren: " + gegevens.getTotaalAantalUrenAfgelopenJaar() + "\n" + 
        "InkomstenBelasting: " + berekenBelasting() + "\n"
         );

         System.out.println("");

         try {
            FileWriter fileWriter = new FileWriter("InkomstenBelasting.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("De inkomstenbelasting voor dit jaar ziet er als volgt uit: ");
            printWriter.println("Totale omzet: " + gegevens.getTotaalOmzetAfgelopenJaar());
            printWriter.println("Totaal aantal uren: " + gegevens.getTotaalAantalUrenAfgelopenJaar());
            printWriter.println("InkomstenBelasting: " + berekenBelasting());
            printWriter.println("-----------------------------------");
        
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Er is een fout opgetreden bij het schrijven naar het bestand");
            e.printStackTrace();
        }

    }
 
    public boolean GeldigOfOngeldigeDecision(){

if ((gegevens.getTotaalOmzetAfgelopenJaar() > 0 ) && (gegevens.getTotaalAantalUrenAfgelopenJaar() > 0 ) && (gegevens.getKostenAfgelopenJaar() < gegevens.getTotaalOmzetAfgelopenJaar()) ){
    
    return true;

}

     else {

        return false;
     }  
        
    }
 

    
    } 

