public class Main{

    public static void main(String args[]) {
OmzetBelasting omzet = new OmzetBelasting();
omzet.BerekenBelasting();
omzet.toonBelasting();

InkomstenBelasting inkomst = new InkomstenBelasting();
inkomst.BerekenBelasting();
inkomst.toonBelasting();
        
    }
}