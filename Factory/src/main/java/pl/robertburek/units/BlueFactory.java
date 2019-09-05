package pl.robertburek.units;

/**
 * Created by Robert Burek
 */
public class BlueFactory extends Factory {

    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case SNIPER:
                return new Sniper(25, 0, 9);
            case SAPPER:
                return new Sapper(10, 0, 8);
            case RIFLEMAN:
                return new Rifleman(30, 0, 7);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(150, 0, 25);
            case TRANSPORTER:
                return new Transporter(100, 0, 12);
            case JEEP:
                return new Jeep(80, 0, 10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType) {
            case HELICOPTER:
                return new Helicopter(100, 0, 25);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
