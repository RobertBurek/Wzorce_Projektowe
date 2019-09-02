package pl.robertburek.house;

/**
 * Created by Robert Burek
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

//    public HouseDirector(HouseBuilder houseBuilder) {
//        this.houseBuilder = houseBuilder;
//    }

    public HouseDirector() {
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildRoof();
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }

}
