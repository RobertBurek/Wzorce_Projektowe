package pl.robertburek.carsfactory;

/**
 * Created by Robert Burek
 */
public class CommonwealthFactory implements Factory {

    SteeringWheelPosition left = SteeringWheelPosition.LEFT;

    public Car buildFord(FordModel model) {
        switch (model) {
            case CMAX:
                return new Ford("1.4", Fuel.DIESEL, "2019", left);
            case FOCUS:
                return new Ford("1.6", Fuel.ELECTRIC, "2018", left);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public Car buildBmw(BmwModel model) {
        switch (model) {
            case X5:
                return new Bmw("1.8", Fuel.GAS, "2019", left);
            case E60:
                return new Bmw("2.0", Fuel.PETROL, "2018", left);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
