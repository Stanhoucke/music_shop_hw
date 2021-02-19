package instruments;

import instruments.saxophones.Saxophone;
import instruments.saxophones.SaxophoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {
    
    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Brass","Gold",InstrumentType.WOODWIND, SaxophoneType.ALTO,70.00,110.00);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.WOODWIND, saxophone.getInstrumentType());
    }

    @Test
    public void hasSaxophoneType() {
        assertEquals(SaxophoneType.ALTO, saxophone.getSaxophoneType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(70.00, saxophone.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(110.00, saxophone.getSellPrice(), 0.0);
    }
    
    @Test
    public void canPlaySound() {
        assertEquals("That sweet saxophone sound", saxophone.playSound());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(40.00, saxophone.calculateMarkUp(), 0.01);
    }
}
