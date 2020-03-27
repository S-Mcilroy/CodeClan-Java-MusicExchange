import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Trumpet;
import Miscellaneous.DrumStick;
import Miscellaneous.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    SheetMusic sheetMusic;
    Trumpet trumpet;
    DrumStick drumStick;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange", 1000);
        guitar = new Guitar("Wood", "Red", InstrumentType.GUITAR, 10.00, 20.00, 5);
        sheetMusic = new SheetMusic(10, 10.00, 20.00);
        trumpet = new Trumpet("Metal", "Silver", InstrumentType.BRASS, 10.00, 20.00, 5);
        drumStick = new DrumStick("Wood", "Red", 10.00, 20.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(1000, shop.getTill(), 0.01);
    }

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canBuyStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStock());
        assertEquals(990, shop.getTill(), 0.01);
    }

    @Test
    public void canSellStock(){
        shop.addStock(guitar);
        shop.addStock(drumStick);
        shop.addStock(trumpet);
        assertEquals(970, shop.getTill() , 0.01);
        shop.sellItem(guitar);
        shop.sellItem(trumpet);
        assertEquals(1010, shop.getTill(), 0.01);
    }

    @Test
    public void canGetTotalPotentialProfits(){
        shop.addStock(guitar);
        shop.addStock(drumStick);
        shop.addStock(trumpet);
        shop.addStock(sheetMusic);
        assertEquals(40, shop.potentialProfit(), 0.01);
    }
}
