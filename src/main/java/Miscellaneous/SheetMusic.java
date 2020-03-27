package Miscellaneous;

public class SheetMusic extends Item{

    private int numberOfPages;

    public SheetMusic(int numberOfPages, double buyPrice, double sellPrice){
        super(buyPrice, sellPrice);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

}
