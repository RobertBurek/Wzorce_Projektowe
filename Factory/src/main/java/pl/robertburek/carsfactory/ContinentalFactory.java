package pl.robertburek.carsfactory;

/**
 * Created by Robert Burek
 */
public class ContinentalFactory implements Factory {

    SteeringWheelPosition right = SteeringWheelPosition.RIGHT;

    public Car buildFord(FordModel model) {
        switch (model) {
            case CMAX:
                return new Ford("1.6", Fuel.DIESEL, "2019", right);
            case FOCUS:
                return new Ford("1.8", Fuel.ELECTRIC, "2019", right);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public Car buildBmw(BmwModel model) {
        switch (model) {
            case X5:
                return new Bmw("2.0", Fuel.GAS, "2019", right);
            case E60:
                return new Bmw("2.2", Fuel.PETROL, "2019", right);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
