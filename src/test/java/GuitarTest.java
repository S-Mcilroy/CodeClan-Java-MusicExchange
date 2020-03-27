import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Wood", "Red", InstrumentType.GUITAR, 10.00, 20.00, 5);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(10, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(20, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkUpAmount(){
        assertEquals(10, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("*Rock Guitar Sounds*", guitar.play());
    }

}
