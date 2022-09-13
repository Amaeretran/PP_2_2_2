package web.model;

public class Car {

    private String model;

    private String driver;

    private int maxSpeed;


    public Car() {
    }

    public Car(String model, String driver, int maxSpeed) {
        this.model = model;
        this.driver = driver;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
