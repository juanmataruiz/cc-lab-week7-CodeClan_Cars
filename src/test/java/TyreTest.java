import car_shop.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre("SafeTyre", "Continental");
    }

    @Test
    public void hasModel() {
        assertEquals("SafeTyre", tyre.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Continental", tyre.getMake());
    }
}
