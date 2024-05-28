package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OmzetBelasting extends Berekening {
    public int omzet = gegevens.getUurloon() * gegevens.getGewerkteUren();

    public OmzetBelasting() {
        super();
        omzet = gegevens.getUurloon() * gegevens.getGewerkteUren();
    }
    
    
    

    @Override

    public int berekenBelasting(){
   

       int BTW = (int) (omzet * 0.21);
                
        return BTW;
    }

    public int BerekenVoorBelasting(){
        int Voorbelasting = (int) (gegevens.getKosten() * 0.21);

        return Voorbelasting;
    }

    @Override

    public void toonBelasting(){
        System.out.println("");

        System.out.println("De omzetbelasting voor deze klus ziet er als volgt uit: " + "\n" + 
        "Uurloon: " + gegevens.getUurloon() + " EUR" + "\n" + 
        "Gewerkte uren: " + gegevens.getGewerkteUren() + " UUR" + "\n" + 
        "Omzet: " + omzet + " EUR" + "\n" + 
        "Voorbelasting: "  + BerekenVoorBelasting() + " EUR" +  "\n" + 
        "Omzetbelasting: " + berekenBelasting() + " EUR" + "\n"

        );

        System.out.println("Wilt uw dit overzicht printen naar een extern bestand? ");

        try { 
            FileWriter fileWriter = new FileWriter("OmzetBelasting.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
        
            printWriter.println("De omzetbelasting voor deze klus ziet er als volgt uit: ");
            printWriter.println("Uurloon: " + gegevens.getUurloon() + " EUR");
            printWriter.println("Gewerkte uren: " + gegevens.getGewerkteUren() + " UUR");
            printWriter.println("Omzet: " + omzet + " EUR");
            printWriter.println("Voorbelasting: "  + BerekenVoorBelasting() + " EUR");
            printWriter.println("Omzetbelasting: " + berekenBelasting() + " EUR");
            printWriter.println("-----------------------------------");
        
            printWriter.close();
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Er is een fout opgetreden bij het schrijven naar het bestand");
            e.printStackTrace();
        }
}
}
