package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;
import java.util.Scanner;
interface Berekening {

    GegevensInvoer gegevensInvoer = new GegevensInvoer(new Scanner(System.in));
    Gegevens gegevens = gegevensInvoer.getGegevensInvoer();

 int BerekenBelasting();

 void toonBelasting();
}
