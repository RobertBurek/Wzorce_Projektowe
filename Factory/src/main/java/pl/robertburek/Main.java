package pl.robertburek;

import pl.robertburek.units.Unit;
import pl.robertburek.units.UnitFactory;
import pl.robertburek.units.UnitType;

public class Main {

    public static void main(String[] args) {
//        Unit tank = new Tank(200, 0, 20);
//        Unit rifleman = new Rifleman(100, 0, 10);

        UnitFactory unitFactory = new UnitFactory();

        Unit tank = unitFactory.createUnit(UnitType.TANK);
        Unit rifleman = unitFactory.createUnit(UnitType.RIFLEMAN);

//        Unit tank2 = new Tank(100,1,20); nie zadziała ze względu na zasięg klas

        System.out.println("Tank: " + tank);
        System.out.println("Rifleman: " + rifleman);

    }
}
