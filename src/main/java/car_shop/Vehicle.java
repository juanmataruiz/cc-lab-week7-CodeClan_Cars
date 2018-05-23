package car_shop;

public abstract class Vehicle {
    
    private double price;
    private String colour;
    private Engine engine;
    private String model;
    private String make;
    private int wheels;
    private Tyre tyre;
    private Seat seat;
    
    public Vehicle(double price, String colour, Engine engine, String model, String make, int wheels, Tyre tyre, Seat seat) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.model = model;
        this.make = make;
        this.wheels = wheels;
        this.tyre = tyre;
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getWheels() {
        return wheels;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public Seat getSeat() {
        return seat;
    }
}
