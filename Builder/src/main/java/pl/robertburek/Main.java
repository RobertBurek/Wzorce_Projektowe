package pl.robertburek;


import pl.robertburek.house.BigHouseBuilder;
import pl.robertburek.house.House;
import pl.robertburek.house.HouseDirector;
import pl.robertburek.house.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
//        House house2 = new House("")

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector houseDirector = new HouseDirector();
        houseDirector.setHouseBuilder(smallHouseBuilder);
        houseDirector.buildHouse();
        House smallHouse = houseDirector.getHouse();
        houseDirector.setHouseBuilder(bigHouseBuilder);
        houseDirector.buildHouse();
        House bigHouse = houseDirector.getHouse();

//        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
//        smallHouseDirector.buildHouse();

//        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
//        bigHouseDirector.buildHouse();

//        House smallHouse = smallHouseDirector.getHouse();
//        House smallHouse = smallHouseBuilder.getHouse();
//        House bigHouse = bigHouseDirector.getHouse();
//        House bigHouse = bigHouseBuilder.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);
    }
}
