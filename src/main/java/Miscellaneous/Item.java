package Miscellaneous;

import Behaviours.ISell;

public abstract class Item implements ISell {

    private double buyPrice;
    private double sellPrice;

    public Item(double buyPrice, double sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

}
