package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {

    private String material;
    private String colour;
    private InstrumentType type;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String material, String colour, InstrumentType type, double buyPrice, double sellPrice){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }

    public String play(){
      return this.type.getValue();
    }

}
