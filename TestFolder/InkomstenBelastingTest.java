package TestFolder;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.Gegevens;
import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.InkomstenBelasting;


public class InkomstenBelastingTest {

    private Gegevens gegevens;
    private InkomstenBelasting inkomstenBelasting;

    // Arrange
    public void setUp() {
        gegevens = new Gegevens("Mustafa","Tegels leggen", 20, 1700, 50000, 1200, 0);
        inkomstenBelasting = new InkomstenBelasting();
        inkomstenBelasting.setGegevens(gegevens);
    }

    @Test
    //Act
    public void testBerekenBelastingLowIncome() {
        gegevens.setTotaalOmzetAfgelopenJaar(10000);
        //Assert
        assertEquals(1500, inkomstenBelasting.BerekenBelasting());
    }

    @Test
    //Act
    public void testBerekenBelastingMidIncome() {
        gegevens.setTotaalOmzetAfgelopenJaar(30000);
        //Assert
        assertEquals(6250, inkomstenBelasting.BerekenBelasting());
    }
   

    @Test
    public void testBerekenBelastingHighIncome() {
        //Act
        gegevens.setTotaalOmzetAfgelopenJaar(70000);
        //Assert
        assertEquals(24000, inkomstenBelasting.BerekenBelasting());
    }

   

}
