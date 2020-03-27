package Instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType type, double buyPrice, double sellPrice, int numberOfValves){
        super(material, colour, type, buyPrice, sellPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
