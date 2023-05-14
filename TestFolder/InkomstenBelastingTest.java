package TestFolder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.Gegevens;
import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.InkomstenBelasting;
import main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa.GegevensInvoer;

public class InkomstenBelastingTest {

    GegevensInvoer gegevensInvoer = new GegevensInvoer(new Scanner(System.in));
      

    @Test
    public void testBerekenBelasting_Met_1EURO_Als_Omzet() {
        // Arrange
        InkomstenBelasting inkomstenBelasting = new InkomstenBelasting();
        Gegevens gegevens = gegevensInvoer.getGegevens("John", "Klus", 10, 40, 100, 10000, 1000, 1500);
        inkomstenBelasting.setGegevens(gegevens);

        // Act
        int belasting = inkomstenBelasting.BerekenBelasting();

        // Assert
        assertEquals(1, belasting);
    }

    @Test
    public void testBerekenBelasting_Met_39999EURO_Als_Omzet() {
        // Arrange
        InkomstenBelasting inkomstenBelasting = new InkomstenBelasting();
        Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 30000, 1000, 1200);
        inkomstenBelasting.setGegevens(gegevens);

        // Act
        int belasting = inkomstenBelasting.BerekenBelasting();

        // Assert
        assertEquals(39999, belasting);
    }

    @Test
    public void testBerekenBelasting_Met_40000EURO_Als_Omzet() {
        // Arrange
        InkomstenBelasting inkomstenBelasting = new InkomstenBelasting();
        Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 80000, 1000, 1100);
        inkomstenBelasting.setGegevens(gegevens);

        // Act
        int belasting = inkomstenBelasting.BerekenBelasting();

        // Assert
        assertEquals(40000, belasting);
    }

    @Test
    public void testBerekenBelasting_Met_999999EURO_Als_Omzet() {
        // Arrange
        InkomstenBelasting inkomstenBelasting = new InkomstenBelasting();
        Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 120000, 1000, 1000);
        inkomstenBelasting.setGegevens(gegevens);

        // Act
        int belasting = inkomstenBelasting.BerekenBelasting();

        // Assert
        assertEquals(999999, belasting);
    }

    @Test

    public void testGeldigeDecision(){

       

        //Arrange
        InkomstenBelasting Belasting = new InkomstenBelasting();
        //Act

        

        Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 120000, 1000, 1000);
        boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

        //Assert
       assertEquals(true, uitkomst);

    }

    public void testOngeldigeDecision(){

        
        //Arrange
        InkomstenBelasting Belasting = new InkomstenBelasting();

        //Act
        Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 120000, 1000, 130000);
        boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

        //Arrange

        assertEquals(false, uitkomst);

    }

    @Test

    void test_12000_Hoger_Wel(){
        //Arrange
        InkomstenBelasting Belasting = new InkomstenBelasting();


        //Act

        Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 12000, 1000, 13000);
        boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

    


        //Assert
        assertEquals(false, uitkomst);

        
    }

    @Test

        void test_12000_Lager_Geen(){
            //Arrange
            InkomstenBelasting Belasting = new InkomstenBelasting();

            //Act
        Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 120000, 0, 1300);
        boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

         //Assert

         assertEquals(false, uitkomst);

        }

@Test

   void test_40001_Lager_Wel(){

    //Arrange
    InkomstenBelasting Belasting = new InkomstenBelasting();
   

   //Act
   Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 40001, 2500, 1300);
        boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

         //Assert
         assertEquals(true, uitkomst);
   }
   @Test

   void test_40001_Hoger_Geen(){
//Arrange
InkomstenBelasting Belasting = new InkomstenBelasting();
   

//Act
Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 40001, 0, 130000);
     boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

      //Assert
      assertEquals(false, uitkomst);

   }

   @Test

   void test_50000_Lager_Wel(){

    //Arrange
InkomstenBelasting Belasting = new InkomstenBelasting();
   

//Act
Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 50000, 2570, 12500);
     boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

//Assert
assertEquals(true, uitkomst);
   }

   @Test

   void test_50000_Hoger_Geen(){
//Arrange
InkomstenBelasting Belasting = new InkomstenBelasting();
   

//Act
Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 50000, 0, 125000);
     boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

//Assert
assertEquals(false, uitkomst);

   }

   @Test

   void test_999999998_Hoger_Geen(){
//Arrange
InkomstenBelasting Belasting = new InkomstenBelasting();
   

//Act
Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 999999998, 0, 999999999);
     boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

//Assert
assertEquals(false, uitkomst);
    
   }

   @Test

   void test_999999998_Lager_Wel(){

//Arrange
InkomstenBelasting Belasting = new InkomstenBelasting();
   

//Act
Gegevens gegevens = new Gegevens("John", "Klus", 10, 40, 100, 999999998, 3000, 999999997);
     boolean uitkomst = Belasting.GeldigOfOngeldigeDecision();

//Assert
assertEquals(true, uitkomst);
    
   }

   }


