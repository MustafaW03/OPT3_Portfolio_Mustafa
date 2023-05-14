package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;
public class Gegevens {
    
    

    private String naam;
    private String klus;  
    private int uurloon;
    private int gewerkteUren;
    private int kosten;
    private int totaalOmzetAfgelopenJaar;
    private int kostenAfgelopenJaar;
    private int totaalAantalUrenAfgelopenJaar;


 public Gegevens(String naam, String klus, int uurloon, int gewerkteUren, int kosten, int totaalOmzetAfgelopenJaar, int totaalAantalUrenAfgelopenJaar, int kostenAfgelopenjaar ){
this.naam = naam;
this.klus = klus;
this.uurloon = uurloon;
this.gewerkteUren = gewerkteUren;
this.kosten = kosten;
this.totaalOmzetAfgelopenJaar = totaalOmzetAfgelopenJaar;
this.totaalAantalUrenAfgelopenJaar = totaalAantalUrenAfgelopenJaar;
this.kostenAfgelopenJaar = kostenAfgelopenjaar;

    }

    public String getNaam() {
        return naam;
    }

    

    public String getKlus(){
        return klus;
    }

    

    public int getUurloon() {
        return uurloon;
    }

    

    public int getGewerkteUren(){
        return gewerkteUren;
    }

    
    public int getKosten(){
        return kosten;
    }

    

    public int getTotaalOmzetAfgelopenJaar() {
        return totaalOmzetAfgelopenJaar;
    }

    public void setTotaalOmzetAfgelopenJaar(int totaalOmzetAfgelopenJaar){

        this.totaalOmzetAfgelopenJaar = totaalOmzetAfgelopenJaar;
    }

    

    public int getTotaalAantalUrenAfgelopenJaar() {
        return totaalAantalUrenAfgelopenJaar;
    }

    public int getKostenAfgelopenJaar(){
        return kostenAfgelopenJaar;
    }

   



}
