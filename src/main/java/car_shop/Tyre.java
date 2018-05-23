package car_shop;

public class Tyre {
    
    private String model;
    private String make;
    
    public Tyre(String model, String make) {
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
