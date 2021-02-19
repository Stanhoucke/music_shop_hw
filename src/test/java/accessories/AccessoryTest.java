package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("guitar strings", 3.00, 6.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("guitar strings", accessory.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(3.00, accessory.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(6.00, accessory.getSellPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(3.00, accessory.calculateMarkUp(), 0.01);
    }
}
