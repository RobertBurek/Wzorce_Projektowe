package pl.robertburek.units;

/**
 * Created by Robert Burek
 */
public class BlueMechanizedUnitFactory extends MechanizedFactory {

    public MechanizedUnit createUnit(MechanizedUnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(200, 0, 20);
            case TRANSPORTER:
                return new Transporter(80, 0, 15);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
