import car_shop.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorBikeTest {

    MotorBike motorBike;
    Engine engine;
    Tyre tyre;
    Seat seat;

    @Before
    public void before() {
        engine = new Engine("power", "Finn");
        tyre = new Tyre("SafeTyre", "Continental");
        seat = new Seat("Comfy", "Recaro");
        motorBike = new MotorBike(1000.00,"Red", engine, "SZ-RR", "Yamaha", 2, tyre, seat);
    }

    @Test
    public void hasPrice() {
        assertEquals(1000.00, motorBike.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("Red", motorBike.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, motorBike.getEngine());
    }

    @Test
    public void hasModel() {
        assertEquals("SZ-RR", motorBike.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Yamaha", motorBike.getMake());
    }

    @Test
    public void hasWheels() {
        assertEquals(2, motorBike.getWheels());
    }

    @Test
    public void hasTyre() {
        assertEquals(tyre, motorBike.getTyre());
    }

    @Test
    public void hasSeat() {
        assertEquals(seat, motorBike.getSeat());
    }
}
