package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;
import java.util.Scanner;


public class GegevensInvoer {
    
    private Scanner scanner;

    public GegevensInvoer(Scanner scanner){
        this.scanner = new Scanner(System.in);
    }

    public Gegevens getOmzetGegevens(){
        System.out.println("Wat is uw naam?");
        String naam = scanner.nextLine();
    
        System.out.println("wat voor klus heeft uw uitgevoerd?");
        String klus = scanner.nextLine();
    
        System.out.println("Wat was de uurloon voor deze klus in gehele euro`s?");
        int uurloon = scanner.nextInt();
    
        System.out.println("Wat zijn je gewerkte uren voor deze klus in gehele uren?");
        int gewerkteUren = scanner.nextInt();
    
        System.out.println("Wat zijn de kosten die je hebt gemaakt voor deze klus in gehele euro`s?");
        int kosten = scanner.nextInt();
    
        
        int totaalOmzetAfgelopenJaar = 0;
        int kostenAfgelopenJaar = 0;
        int totaalAantalUrenAfgelopenJaar = 0;
    
        return new Gegevens(naam, klus, uurloon, gewerkteUren, kosten, totaalOmzetAfgelopenJaar, totaalAantalUrenAfgelopenJaar, kostenAfgelopenJaar);
    }
    

    
    public Gegevens getInkomstenGegevens(){
        System.out.println("Wat is de totale omzet die je hebt gegenereert? Dit is nodig om de inkomstenbelasting uit te rekenen");
        int totaalOmzetAfgelopenJaar = scanner.nextInt();
    
        System.out.println("En wat waren je kosten dat jaar?");
        int kostenAfgelopenJaar = scanner.nextInt();
    
        System.out.println("En hoeveel uur heb je daarvoor gewerkt? ");
        int totaalAantalUrenAfgelopenJaar = scanner.nextInt();
    
        
        String naam = "";
        String klus = "";
        int uurloon = 0;
        int gewerkteUren = 0;
        int kosten = 0;
    
        return new Gegevens(naam, klus, uurloon, gewerkteUren, kosten, totaalOmzetAfgelopenJaar, totaalAantalUrenAfgelopenJaar, kostenAfgelopenJaar);
    }

    public Gegevens getGegevens(String string, String string2, int i, int j, int k, int l, int m, int n) {
        return null;
    }
    
}
