import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals rn;

    @Before
    public void setup() {
        rn = new RomanNumerals();
    }


    @Test
    public void check1(){
        rn.setNumber(1);
        rn.convert();
        assertEquals("I", rn.getNumber());
    }

    @Test
    public void check5(){
        rn.setNumber(5);
        rn.convert();
        assertEquals("V", rn.getNumber());
    }

    @Test
    public void check10(){
        rn.setNumber(10);
        rn.convert();
        assertEquals("X", rn.getNumber());
    }

    @Test
    public void check50(){
        rn.setNumber(50);
        rn.convert();
        assertEquals("L", rn.getNumber());
    }

    @Test
    public void check100(){
        rn.setNumber(100);
        rn.convert();
        assertEquals("C", rn.getNumber());
    }

    @Test
    public void check500(){
        rn.setNumber(500);
        rn.convert();
        assertEquals("D", rn.getNumber());
    }

    @Test
    public void check1000(){
        rn.setNumber(1000);
        rn.convert();
        assertEquals("M", rn.getNumber());
    }
}
