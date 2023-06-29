package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;
import java.util.Scanner;

public abstract class Berekening {

    public Gegevens gegevens;

    public Berekening() {
        GegevensInvoer gegevensInvoer = new GegevensInvoer(new Scanner(System.in));
        gegevens = gegevensInvoer.getGegevensInvoer();
    }

    public void  Template(){

        berekenBelasting();
        toonBelasting();
    }

    public abstract int berekenBelasting();

    public abstract void toonBelasting();
}


