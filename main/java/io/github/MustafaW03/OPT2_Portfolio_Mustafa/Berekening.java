package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;
import java.util.Scanner;

public abstract class Berekening {

    public Gegevens omzetgegevens;
    public Gegevens inkomstengegevens;

    public Berekening() {
        GegevensInvoer gegevensInvoer = new GegevensInvoer(new Scanner(System.in));
        omzetgegevens = gegevensInvoer.getOmzetGegevens();

        inkomstengegevens = gegevensInvoer.getInkomstenGegevens();

    }

    public void  Template(){

        berekenBelasting();
        toonBelasting();
    }

    public abstract int berekenBelasting();

    public abstract void toonBelasting();
}


