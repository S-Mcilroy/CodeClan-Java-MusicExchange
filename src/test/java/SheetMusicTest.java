import Miscellaneous.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(10, 10.00, 20.00);
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(10, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(20, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkUpAmount(){
        assertEquals(10, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetNumberOfPages(){
        assertEquals(10, sheetMusic.getNumberOfPages());
    }

}
