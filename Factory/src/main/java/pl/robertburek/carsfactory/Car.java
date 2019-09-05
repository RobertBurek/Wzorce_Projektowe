package pl.robertburek.carsfactory;

/**
 * Created by Robert Burek
 */
public abstract class Car {

    private final String engine;
    private final Fuel fuel;
    private final String productionYear;
    private final SteeringWheelPosition steeringWheelPosition;

    public Car(String engine, Fuel fuel, String productionYear, SteeringWheelPosition steeringWheelPosition) {
        this.engine = engine;
        this.fuel = fuel;
        this.productionYear = productionYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public String getEngine() {
        return engine;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", fuel=" + fuel +
                ", productionYear='" + productionYear + '\'' +
                ", steeringWheelPosition=" + steeringWheelPosition +
                '}';
    }
}
