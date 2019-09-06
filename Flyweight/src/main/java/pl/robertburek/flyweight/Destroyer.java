package pl.robertburek.flyweight;

public class Destroyer {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;


    public Destroyer( int x, int y) {
        this.stats = UnitStatsRepository.getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }

    public UnitStats getStats() {
        return stats;
    }

    @Override
    public String toString() {
        return "Destroyer{" +
                "x=" + x +
                ", y=" + y +
                ", hpLeft=" + hpLeft +
                ", stats=" + stats +
                '}';
    }
}
