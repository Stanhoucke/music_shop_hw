package shop;

import accessories.Accessory;
import behaviours.ISell;
import instruments.InstrumentType;
import instruments.guitars.Guitar;
import instruments.guitars.GuitarType;
import instruments.pianos.Piano;
import instruments.pianos.PianoType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop emptyShop, shop;
    Guitar guitar;
    Piano piano;
    Accessory accessory1, accessory2;
    ArrayList<ISell> newStockList;

    @Before
    public void before(){
        emptyShop = new Shop ("Lord of the Strings");
        shop = new Shop ("Lord of the Strings");

        guitar = new Guitar("Wood","Brown", InstrumentType.STRING, GuitarType.ACOUSTIC,50.00,100.00);
        piano = new Piano("Plastic","Black",InstrumentType.KEYBOARD, PianoType.KEYBOARD,100.00,200.00);
        accessory1 = new Accessory("guitar strings", 3.00, 6.00);
        accessory2 = new Accessory("sheet music", 5.00, 7.00);

        newStockList = new ArrayList<ISell>(Arrays.asList(guitar, piano, accessory1, accessory2));

        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(accessory1);
        shop.addStock(accessory2);
    }

    @Test
    public void hasName() {
        assertEquals("Lord of the Strings", emptyShop.getName());
    }

    @Test
    public void hasStock(){
        assertEquals(new ArrayList<ISell>(), emptyShop.getStock());
    }


    @Test
    public void canAddStock() {
        emptyShop.addStock(guitar);
        emptyShop.addStock(accessory1);
        assertEquals(2, emptyShop.countStock());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(piano);
        assertEquals(3, shop.countStock());
    }

    @Test
    public void canAddStockList(){
        emptyShop.addStock(newStockList);
        assertEquals(4, emptyShop.countStock());
    }

    @Test
    public void canRemoveStockList() {
        shop.removeStock(newStockList);
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        assertEquals(155.00, shop.calculateTotalPotentialProfit(), 0.01);
    }

    @Test
    public void canFilterStockBySellPrice(){
        shop.addStock(accessory1);
        assertEquals(2, shop.filterStockBySellPriceOver(20.00).size());
    }

    @Test
    public void canFilterStockByInstrumentType(){
        assertEquals(1, shop.filterStockByInstrumentType(InstrumentType.STRING).size());
    }
}
