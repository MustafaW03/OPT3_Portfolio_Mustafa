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
    public int berekenBelasting() {
        int[] belastingschaal = {20000, 40000, 60000, Integer.MAX_VALUE};
        double[] rates = {0.15, 0.25, 0.4, 0.5};
        int totalOmzet = inkomstengegevens.getTotaalOmzetAfgelopenJaar();
        int rest = totalOmzet;
        Belasting = 0;
    
        for (int i = 0; i < belastingschaal.length; i++) {
            if (rest <= belastingschaal[i]) {
                int belastbaarInkomen = rest - (i > 0 ? belastingschaal[i - 1] : 0);
                Belasting += Math.round(belastbaarInkomen * rates[i]);
                break;
            } else {
                int belastbaarInkomen = belastingschaal[i] - (i > 0 ? belastingschaal[i - 1] : 0);
                Belasting += Math.round(belastbaarInkomen * rates[i]);
                rest -= belastbaarInkomen;
            }
        }
    
        return Belasting;
    }



    @Override

    public void toonBelasting(){

        System.out.println("");

        System.out.println("De inkomstenbelasting ziet er als volgt uit: " + "\n" +
        "Totale omzet: " + inkomstengegevens.getTotaalOmzetAfgelopenJaar() + "\n" + 
        "Totaal aantal uren: " + inkomstengegevens.getTotaalAantalUrenAfgelopenJaar() + "\n" + 
        "InkomstenBelasting: " + berekenBelasting() + "\n"
         );

         System.out.println("");

         try {
            FileWriter fileWriter = new FileWriter("InkomstenBelasting.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("De inkomstenbelasting voor dit jaar ziet er als volgt uit: ");
            printWriter.println("Totale omzet: " + inkomstengegevens.getTotaalOmzetAfgelopenJaar());
            printWriter.println("Totaal aantal uren: " + inkomstengegevens.getTotaalAantalUrenAfgelopenJaar());
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

if ((inkomstengegevens.getTotaalOmzetAfgelopenJaar() > 0 ) && (inkomstengegevens.getTotaalAantalUrenAfgelopenJaar() > 0 ) && (inkomstengegevens.getKostenAfgelopenJaar() < inkomstengegevens.getTotaalOmzetAfgelopenJaar()) ){
    
    return true;

}

     else {

        return false;
     }  
        
    }
 

    
    } 

