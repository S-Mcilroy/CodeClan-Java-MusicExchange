import Miscellaneous.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

     DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick("Wood", "Red", 10.00, 20.00);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", drumStick.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", drumStick.getColour());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(10, drumStick.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(20, drumStick.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkUpAmount(){
        assertEquals(10, drumStick.calculateMarkup(), 0.01);
    }

}
