import Behaviours.ISell;
import Instruments.Instrument;
import Miscellaneous.Item;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock.size();

    }

    public void addStock(ISell item){
        this.stock.add(item);
        if ( item instanceof Instrument){
            this.till -= ((Instrument) item).getBuyPrice();
        } else {
            this.till -= ((Item) item).getBuyPrice();
        }

    }

    public double getTill() {
        return till;
    }

    public void sellItem(ISell item){
        if (this.stock.contains(item)){
            this.stock.remove(item);
            if ((Instrument) item != null){
                this.till += ((Instrument) item).getSellPrice();
            } else {
                this.till += ((Item) item).getSellPrice();
            }
        }
    }

    public double potentialProfit(){
        double totalCostMarkUp = 0;
        for (ISell item : this.stock){
           totalCostMarkUp += item.calculateMarkup();
        }
        return totalCostMarkUp;
    }
}
