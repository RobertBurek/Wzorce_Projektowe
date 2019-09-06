package pl.robertburek.flyweight;

/**
 * Created by Robert Burek
 */
public class UnitStatsRepository {

    private static DestroyerUnitStats destroyerStats = new DestroyerUnitStats("Destroyer", 500, 250, 70, 10,  800);
    private static TeslaTankUnitStats teslaTankStats = new TeslaTankUnitStats("TeslaTank", 200, 100, 50, 25, 500);
    private static RiflemanUnitStats riflemanStats = new RiflemanUnitStats("Rifleman", 25, 5, 20, 25, 50);

    private UnitStatsRepository() {
    }

    public static DestroyerUnitStats getDestroyerStats(){
        return destroyerStats;
    }

    public static TeslaTankUnitStats getTeslaTankStats(){
        return teslaTankStats;
    }

    public static RiflemanUnitStats getRiflemanStats(){
        return riflemanStats;
    }
}
