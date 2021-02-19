package shop;

import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop ("Lord of the Strings");
    }

    @Test
    public void hasName() {
        assertEquals("Lord of the Strings", shop.getName());
    }

    @Test
    public void hasStock(){
        assertEquals(new ArrayList<ISell>(), shop.getStock());
    }

}
