import car_shop.Seat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatTest {

    Seat seat;

    @Before
    public void before() {
        seat = new Seat("Comfy", "Recaro");
    }

    @Test
    public void hasModel() {
        assertEquals("Comfy", seat.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Recaro", seat.getMake());
    }
}
