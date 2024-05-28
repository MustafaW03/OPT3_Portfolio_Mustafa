package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;
public class Main{

    public static void main(String args[]) {
        BerekeningFactory omzetFactory = new OmzetBelastingFactory();
        Berekening omzet = omzetFactory.createBerekening();
        omzet.Template();

        BerekeningFactory inkomstenFactory = new InkomstenBelastingFactory();
        Berekening inkomsten = inkomstenFactory.createBerekening();
        inkomsten.Template();
      
    }
}