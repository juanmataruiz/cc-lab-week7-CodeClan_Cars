import car_shop.Car;
import car_shop.Engine;
import car_shop.Seat;
import car_shop.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyre tyre;
    Seat seat;

    @Before
    public void before() {
        engine = new Engine("power", "Finn");
        tyre = new Tyre("SafeTyre", "Continental");
        seat = new Seat("Comfy", "Recaro");
        car = new Car(5000.00,"Blue", engine,"M3", "BMW", 4, tyre, seat);
    }

    @Test
    public void hasPrice() {
        assertEquals(5000.00, car.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasModel() {
        assertEquals("M3", car.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("BMW", car.getMake());
    }

    @Test
    public void hasWheels() {
        assertEquals(4, car.getWheels());
    }

    @Test
    public void hasTyre() {
        assertEquals(tyre, car.getTyre());
    }

    @Test
    public void hasSeat() {
        assertEquals(seat, car.getSeat());
    }



}
