package pl.robertburek;

import pl.robertburek.units.*;

public class Main {

    public static void main(String[] args) {
//        InfantryUnit tank = new Tank(200, 0, 20);
//        InfantryUnit rifleman = new Rifleman(100, 0, 10);

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();


        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        MechanizedUnit blueTransporter = blueFactory.createMechanizedUnit(UnitType.TRANSPORTER);
        InfantryUnit redSniper = redFactory.createInfantryUnit(UnitType.SNIPER);
        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);

//        InfantryUnit tank2 = new Tank(100,1,20); //nie zadziała ze względu na zasięg klas

        System.out.println("blueTank: " + blueTank);
        System.out.println("blueTransporter: " + blueTransporter);
        System.out.println("blueRifleman: " + blueRifleman);
        System.out.println("redSniper: " + redSniper);
        System.out.println("redTank: " + redTank);
        System.out.println("redHelicopter: " + redHelicopter);
        System.out.println("blueHelicopter: " + blueHelicopter);

    }
}
