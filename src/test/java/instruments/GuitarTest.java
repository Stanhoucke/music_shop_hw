package instruments;

import instruments.guitars.Guitar;
import instruments.guitars.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood","Brown",InstrumentType.STRING, GuitarType.ACOUSTIC,50.00,100.00);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(50.00, guitar.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(100.00, guitar.getSellPrice(), 0.0);
    }
}
