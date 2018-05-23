import car_shop.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("Power", "Finn");
    }

    @Test
    public void hasModel() {
        assertEquals("SafeTyre", engine.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Continental", engine.getMake());
    }
}
