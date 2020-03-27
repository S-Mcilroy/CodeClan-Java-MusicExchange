package Instruments;

public enum InstrumentType {
    KEYBOARD("*Crazy Keyboard Sounds*"),
    WIND("*Mystical Wind Sounds*"),
    BRASS("*Jazz Brass Sounds*"),
    STRING("*Pierce String Sounds*"),
    GUITAR("*Rock Guitar Sounds*"),
    ELECTRICGUITAR("*Heavy Rock Guitar Sounds*"),
    DRUM("*Heavy Drum Sounds*");


    private final String value;


    InstrumentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

