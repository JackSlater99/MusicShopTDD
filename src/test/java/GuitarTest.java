import Instruments.Guitars;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitars guitar;

    @Before
    public void before(){
        guitar = new Guitars(80, 150, InstrumentType.STRING, "Fender", "Wood", "Red", 6);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(80, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(150, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("guitar noises", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.88, guitar.calculateMarkup(), 0.01);
    }
}
