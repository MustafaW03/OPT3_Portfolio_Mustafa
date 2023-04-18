
public class OmzetBelasting implements Berekening {
   
   
    int omzet = gegevens.getUurloon() * gegevens.getGewerkteUren();
    @Override

    public int BerekenBelasting(){
   

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
        "Omzetbelasting: " + BerekenBelasting() + " EUR" + "\n"

        );

        System.out.println("Wilt uw dit overzicht printen naar een extern bestand? ");

    }
}
