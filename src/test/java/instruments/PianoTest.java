package instruments;

import instruments.guitars.GuitarType;
import instruments.pianos.Piano;
import instruments.pianos.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Plastic","Black",InstrumentType.KEYBOARD, PianoType.KEYBOARD,100.00,200.00);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Plastic", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasPianoType() {
        assertEquals(PianoType.KEYBOARD, piano.getPianoType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(100.00, piano.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(200.00, piano.getSellPrice(), 0.0);
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(49, piano.getNumberOfKeys());
    }

    @Test
    public void canPlaySound() {
        assertEquals("That sweet piano sound", piano.playSound());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(100.00, piano.calculateMarkUp(), 0.01);
    }


}
