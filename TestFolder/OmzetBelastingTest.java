package TestFolder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.Gegevens;
import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.OmzetBelasting;
import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.GegevensInvoer;

    


public class OmzetBelastingTest {

   

    

    GegevensInvoer gegevensInvoer = new GegevensInvoer(new Scanner(System.in));
        Gegevens gegevens = gegevensInvoer.getGegevensInvoer();


    @Test
    public void testBerekenBelasting() {
        OmzetBelasting omzetBelasting = new OmzetBelasting();
        int expected = (int) (gegevens.getUurloon() * gegevens.getGewerkteUren() * 0.21);
        int actual = omzetBelasting.BerekenBelasting();
        assertEquals(expected, actual);
    }

    @Test
    public void testBerekenVoorBelasting() {
        OmzetBelasting omzetBelasting = new OmzetBelasting();
        int expected = (int) (gegevens.getKosten() * 0.21);
        int actual = omzetBelasting.BerekenVoorBelasting();
        assertEquals(expected, actual);
    }

   

    public void testToonBelasting() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        OmzetBelasting omzetBelasting = new OmzetBelasting();
        omzetBelasting.toonBelasting();
        String expectedOutput = "\nDe omzetbelasting voor deze klus ziet er als volgt uit: \nUurloon: 15 EUR\nGewerkte uren: 20 UUR\nOmzet: 300 EUR\nVoorbelasting: 21 EUR\nOmzetbelasting: 63 EUR\n\nWilt uw dit overzicht printen naar een extern bestand? \n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
