package main.java.io.github.MustafaW03.OPT2_Portfolio_Mustafa;

public class InkomstenBelastingFactory extends BerekeningFactory{
    @Override
    public Berekening createBerekening() {
        return new InkomstenBelasting();
    }
}
