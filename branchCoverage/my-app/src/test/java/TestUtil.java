import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
    private Util c;

    @Before
    public void setUp() {
        c = new Util();
    }

    @Test
    public void testSifir() {
      try {
          c.compute(1, 2, 0);
          fail("Eğer runtime yemezse test faillanmali");
      } catch (RuntimeException exception) {}
  }
    @Test
    public void testTekSayidaArgümanKSumKati() {
        assertTrue("Tek sayida argümanlar verilince toplami ve toplamları argümanların katı ise true dönmeli", c.compute(2, 5, 10, 11, -28));
  }

    @Test
     public void testTekSayidaArgümanKSumKatiDeğil() {
        assertFalse("Tek sayida argümanlar verilince toplami ve toplamları argümanların katı değilse false dönmeli", c.compute(5, 7, 17));
    }


    @Test
    public void testBirdenFazlaSifir() {
        try {
            c.compute(0, 0, 0);
            fail("Eğer runtime yemezse test faillanmali");
        } catch (RuntimeException e) {}
    }
    @Test
    public void testBirArgüman() {
        assertFalse("Tek bir argüman verilince false dönmeli", c.compute(1));
    }

    @Test
    public void testÇiftTaneArgüman() {
        assertFalse("Çift sayida argüman verilirse false dönmeli", c.compute(1, 2));
    }
}
