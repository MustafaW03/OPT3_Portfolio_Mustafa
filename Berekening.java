import java.util.Scanner;
interface Berekening {

    GegevensInvoer gegevensInvoer = new GegevensInvoer(new Scanner(System.in));
    Gegevens gegevens = gegevensInvoer.getGegevensInvoer();

 int BerekenBelasting();

 void toonBelasting();
}
