package car_shop;

public class Engine {

    private String model;
    private String make;

    public Engine(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
}
