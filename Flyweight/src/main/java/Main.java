import pl.robertburek.flyweight.Destroyer;
import pl.robertburek.flyweight.Rifleman;
import pl.robertburek.flyweight.TeslaTank;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<Object>();

        for (int i = 0; i < 100; i++) {
            activeUnits.add(new TeslaTank(0,0));
            activeUnits.add(new Rifleman(0,0));
            activeUnits.add(new Destroyer(0,0));
        }
    }
}
