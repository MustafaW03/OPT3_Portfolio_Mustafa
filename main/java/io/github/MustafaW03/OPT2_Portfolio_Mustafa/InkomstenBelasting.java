package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;

public class InkomstenBelasting extends OmzetBelasting {

    
    public int Belasting = 0;
   
    @Override

    public int BerekenBelasting(){
        

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
        "InkomstenBelasting: " + BerekenBelasting() + "\n"
         );

         System.out.println("");

         System.out.println("Let op! Dit is nog maar een inschatting van je inkomstenbelasting op basis van je totale omzet." + "\n" + 
         "We raden je het aan om een financieel adviseur er nog een keer naar te laten kijken" + "\n" +  "Omdat dit vaak extra belastingvoordelen kan toevoegen waardoor je uitendeljk minder belasting betaalt." + "\n" + 
         "Deze inschatting is er voor bedoeld om de kosten van zo een adviseur zo laag mogelijk te houden doordat het bulk van het werk al gedaan is."
         );

         System.out.println("");

         System.out.println("Wilt uw dit overzicht printen naar een extern bestand?");

    }


    public void setGegevens(Gegevens gegevenss) {
        

    } 
}
