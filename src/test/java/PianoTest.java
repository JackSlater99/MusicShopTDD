import Instruments.Guitars;
import Instruments.InstrumentType;
import Instruments.Pianos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Pianos piano;

    @Before
    public void before(){
        piano = new Pianos (575, 1000, InstrumentType.KEYBOARD, "Yamaha", "Oak", "Black", 88);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(575, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1000, piano.getSellPrice(), 0.01);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Oak", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasStrings(){
        assertEquals(88, piano.getNoOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("piano noises", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.74, piano.calculateMarkup(), 0.01);
    }
}
