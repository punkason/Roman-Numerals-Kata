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

    @Test
    public void check51(){
        rn.setNumber(51);
        rn.convert();
        assertEquals("LI", rn.getNumber());
    }

    @Test
    public void check55(){
        rn.setNumber(55);
        rn.convert();
        assertEquals("LV", rn.getNumber());
    }

    @Test
    public void check60(){
        rn.setNumber(60);
        rn.convert();
        assertEquals("LX", rn.getNumber());
    }

    @Test
    public void check101(){
        rn.setNumber(101);
        rn.convert();
        assertEquals("CI", rn.getNumber());
    }

    @Test
    public void check300(){
        rn.setNumber(300);
        rn.convert();
        assertEquals("CCC", rn.getNumber());
    }

    @Test
    public void check600(){
        rn.setNumber(600);
        rn.convert();
        assertEquals("DC", rn.getNumber());
    }

    @Test
    public void check1001(){
        rn.setNumber(1001);
        rn.convert();
        assertEquals("MI", rn.getNumber());
    }

    @Test
    public void check2000(){
        rn.setNumber(2000);
        rn.convert();
        assertEquals("MM", rn.getNumber());
    }

    @Test
    public void check4(){
        rn.setNumber(4);
        rn.convert();
        assertEquals("IV", rn.getNumber());
    }

    @Test
    public void check9(){
        rn.setNumber(9);
        rn.convert();
        assertEquals("IX", rn.getNumber());
    }

    public void check40(){
        rn.setNumber(40);
        rn.convert();
        assertEquals("XL", rn.getNumber());
    }

    public void check90(){
        rn.setNumber(90);
        rn.convert();
        assertEquals("XC", rn.getNumber());
    }

    public void check400(){
        rn.setNumber(400);
        rn.convert();
        assertEquals("CD", rn.getNumber());
    }

    public void check900(){
        rn.setNumber(900);
        rn.convert();
        assertEquals("CM", rn.getNumber());
    }
}
