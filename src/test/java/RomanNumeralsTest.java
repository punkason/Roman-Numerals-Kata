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

    @Test
    public void check2(){
        rn.setNumber(2);
        rn.convert();
        assertEquals("II", rn.getNumber());
    }

    @Test
    public void check3(){
        rn.setNumber(3);
        rn.convert();
        assertEquals("III", rn.getNumber());
    }

    @Test
    public void check6(){
        rn.setNumber(6);
        rn.convert();
        assertEquals("VI", rn.getNumber());
    }

    @Test
    public void check7(){
        rn.setNumber(7);
        rn.convert();
        assertEquals("VII", rn.getNumber());
    }

    @Test
    public void check8(){
        rn.setNumber(8);
        rn.convert();
        assertEquals("VIII", rn.getNumber());
    }

    @Test
    public void check11(){
        rn.setNumber(11);
        rn.convert();
        assertEquals("XI", rn.getNumber());
    }

    @Test
    public void check13(){
        rn.setNumber(13);
        rn.convert();
        assertEquals("XIII", rn.getNumber());
    }

    @Test
    public void check18(){
        rn.setNumber(18);
        rn.convert();
        assertEquals("XVIII", rn.getNumber());
    }
}
