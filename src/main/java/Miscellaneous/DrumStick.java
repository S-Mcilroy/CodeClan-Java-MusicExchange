package Miscellaneous;

public class DrumStick extends Item {

    private String material;
    private String colour;

    public DrumStick(String material, String colour, double buyPrice, double sellPrice){
        super(buyPrice, sellPrice);
        this.material = material;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
