package TestFolder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;
import java.util.Scanner;

import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.GegevensInvoer;
import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.Gegevens;

public class GegevensInvoerTest {

    @Test
public void testGetOmzetGegevens() {
    // Arrange
    GegevensInvoer gegevensInvoer = new GegevensInvoer(new Scanner(System.in));

    //Act
    String inputData = "Jan\nSchilderen\n20\n8\n50\n10000\n2000\n";
    InputStream inputStream = new ByteArrayInputStream(inputData.getBytes());
    System.setIn(inputStream);
    Gegevens gegevens = gegevensInvoer.getOmzetGegevens();

    // Assert
    assertNotNull(gegevens);
    assertEquals("Jan", gegevens.getNaam());
    assertEquals("Schilderen", gegevens.getKlus());
    assertEquals(20, gegevens.getUurloon());
    assertEquals(8, gegevens.getGewerkteUren());
    assertEquals(50, gegevens.getKosten());
    assertEquals(10000, gegevens.getTotaalOmzetAfgelopenJaar());
    assertEquals(2000, gegevens.getTotaalAantalUrenAfgelopenJaar());
}
}
