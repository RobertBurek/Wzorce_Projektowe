package pl.robertburek.units;

/**
 * Created by Robert Burek
 */
public class BlueInfantryUnitFactory extends InfantryFactory {

    public InfantryUnit createUnit(InfantryUnitType unitType) {
        switch (unitType) {
            case SNIPER:
                return new Sniper(200, 0, 20);
            case SAPPER:
                return new Sapper(120, 0, 10);
            case RIFLEMAN:
                return new Rifleman(80, 0, 15);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
