package pl.robertburek.units;

/**
 * Created by Robert Burek
 */
abstract public class Factory {
    abstract public InfantryUnit createInfantryUnit(UnitType unitType);
    abstract public MechanizedUnit createMechanizedUnit(UnitType unitType);
    abstract public AirUnit createAirUnit(UnitType unitType);
}
