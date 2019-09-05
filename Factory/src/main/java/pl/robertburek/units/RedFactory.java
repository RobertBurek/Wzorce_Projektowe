package pl.robertburek.units;

/**
 * Created by Robert Burek
 */
public class RedFactory extends Factory {

    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case SNIPER:
                return new Sniper(20, 0, 13);
            case SAPPER:
                return new Sapper(8, 0, 12);
            case RIFLEMAN:
                return new Rifleman(28, 0, 11);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(140, 0, 21);
            case TRANSPORTER:
                return new Transporter(99, 0, 15);
            case JEEP:
                return new Jeep(85, 0, 18);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType) {
            case HELICOPTER:
                return new Helicopter(110, 0, 30);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
