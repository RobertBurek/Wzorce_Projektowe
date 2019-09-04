package pl.robertburek.units;

/**
 * Created by Robert Burek
 */
public class RedInfantryUnitFactory extends InfantryFactory {

    public InfantryUnit createUnit(InfantryUnitType unitType) {
        switch (unitType) {
            case SNIPER:
                return new Sniper(200, 0, 20);
            case SAPPER:
                return new Sapper(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(80, 0, 15);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
