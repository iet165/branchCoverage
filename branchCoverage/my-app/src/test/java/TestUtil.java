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
   
}
