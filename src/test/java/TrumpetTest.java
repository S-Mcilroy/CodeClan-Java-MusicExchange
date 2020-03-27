import Instruments.InstrumentType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Metal", "Silver", InstrumentType.BRASS, 10.00, 20.00, 5);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Metal", trumpet.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Silver", trumpet.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(10, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(20, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkUpAmount(){
        assertEquals(10, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(5, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("*Jazz Brass Sounds*", trumpet.play());
    }

}
