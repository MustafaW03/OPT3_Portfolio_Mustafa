public class Gegevens {
    
    

    private String naam;
    private String klus;  
    private int uurloon;
    private int gewerkteUren;
    private int kosten;
    private int totaalOmzetAfgelopenJaar;
    private int totaalAantalUrenAfgelopenJaar;


    public Gegevens(String naam, String klus, int uurloon, int gewerkteUren, int kosten, int totaalOmzetAfgelopenJaar, int totaalAantalUrenAfgelopenJaar ){
this.naam = naam;
this.klus = klus;
this.uurloon = uurloon;
this.gewerkteUren = gewerkteUren;
this.kosten = kosten;
this.totaalOmzetAfgelopenJaar = totaalOmzetAfgelopenJaar;
this.totaalAantalUrenAfgelopenJaar = totaalAantalUrenAfgelopenJaar;


    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public String getKlus(){
        return klus;
    }

    public void setKlus(String klus){
        this.klus = klus;
    }

    public int getUurloon() {
        return uurloon;
    }

    public void setUurloon(int uurloon){
        this.uurloon = uurloon;
    }

    public int getGewerkteUren(){
        return gewerkteUren;
    }

    public void setGewerkteUren(int gewerkteUren){
        this.gewerkteUren = gewerkteUren;
    }

    public int getKosten(){
        return kosten;
    }

    public void setKosten(int kosten){
        this.kosten = kosten;
    }

    public int getTotaalOmzetAfgelopenJaar() {
        return totaalOmzetAfgelopenJaar;
    }

    public void setTotaalOmzetAfgelopenJaar(int totaalOmzetAfgelopenJaar) {
        this.totaalOmzetAfgelopenJaar = totaalOmzetAfgelopenJaar;
    }

    public int getTotaalAantalUrenAfgelopenJaar() {
        return totaalAantalUrenAfgelopenJaar;
    }

    public void setTotaalAantalUrenAfgelopenJaar(int totaalAantalUrenAfgelopenJaar) {
        this.totaalAantalUrenAfgelopenJaar = totaalAantalUrenAfgelopenJaar;
    }



}
