package pl.robertburek;


import pl.robertburek.house.House;

public class Main {

    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
//        House house2 = new House("")

        House house = new House.HouseBuilder()
                .buildDoors("doors")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildGarage("garage")
                .build();

        House house2 = new House.HouseBuilder()
                .build();

        House house3 = new House.HouseBuilder()
                .buildRooms("rooms")
                .buildDoors("doors")
                .buildWindows("windows")
                .build();

        System.out.println(house);
        System.out.println(house2);
        System.out.println(house3);
    }

}
