package pl.robertburek;

import pl.robertburek.units.*;

public class Main {

    public static void main(String[] args) {
//        InfantryUnit tank = new Tank(200, 0, 20);
//        InfantryUnit rifleman = new Rifleman(100, 0, 10);

        InfantryFactory blueInfrantyFactory = new BlueInfantryUnitFactory();
        InfantryFactory redInfrantyFactory =   new RedInfantryUnitFactory();

        MechanizedFactory blueMechanizedFactory = new BlueMechanizedUnitFactory();
        MechanizedFactory redMechanizedFactory =   new RedMechanizedUnitFactory();

        MechanizedUnit blueTank = blueMechanizedFactory.createUnit(MechanizedUnitType.TANK);
        MechanizedUnit blueTransporter = blueMechanizedFactory.createUnit(MechanizedUnitType.TRANSPORTER);
        InfantryUnit redSniper = redInfrantyFactory.createUnit(InfantryUnitType.SNIPER);
        MechanizedUnit redTank = redMechanizedFactory.createUnit(MechanizedUnitType.TANK);
        InfantryUnit blueRifleman = blueInfrantyFactory.createUnit(InfantryUnitType.RIFLEMAN);

//        InfantryUnit tank2 = new Tank(100,1,20); //nie zadziała ze względu na zasięg klas

        System.out.println("blueTank: " + blueTank);
        System.out.println("blueTransporter: " + blueTransporter);
        System.out.println("blueRifleman: " + blueRifleman);
        System.out.println("redSniper: " + redSniper);
        System.out.println("redTank: " + redTank);

    }
}
