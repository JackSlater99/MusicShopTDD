import Instruments.Guitars;
import Instruments.InstrumentType;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitars guitar;

    @Before
    public void before(){
        shop = new Shop("Jacks Music Shop");
        guitar = new Guitars(80, 150, InstrumentType.STRING, "Fender", "Wood", "Red", 6);
    }

    @Test
    public void hasName(){
        assertEquals("Jacks Music Shop", shop.getName());
    }

    @Test
    public void inventoryStartsEmpty(){
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddItemsToInventory(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveItemsFromInventory(){
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.getStockSize());
    }
}
