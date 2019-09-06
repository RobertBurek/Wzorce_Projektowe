import pl.robertburek.flyweight.Destroyer;
import pl.robertburek.flyweight.Rifleman;
import pl.robertburek.flyweight.TeslaTank;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<Object>();

        for (int i = 0; i < 1000000; i++) {
            activeUnits.add(new TeslaTank((int) (Math.random() * 450), (int) (Math.random() * 750)));
            activeUnits.add(new Rifleman((int) (Math.random() * 450), (int) (Math.random() * 750)));
            activeUnits.add(new Destroyer((int) (Math.random() * 450), (int) (Math.random() * 750)));
        }

        int rand = 3*(int) (Math.random() * 333330);
        System.out.println(activeUnits.get(5));
        System.out.println(activeUnits.get(5 + rand));
        System.out.println("Element 5 jest równy elementowi " + (5 + rand) + ": " +
                ((Destroyer) activeUnits.get(5)).getStats().equals(((Destroyer) activeUnits.get(5 + 3 * rand)).getStats()));
        System.out.println("");

        rand = 3*(int) (Math.random() * 333330);
        System.out.println(activeUnits.get(3));
        System.out.println(activeUnits.get(3 + rand));
        System.out.println("Element 3 jest równy elementowi " + (5 + rand) + ": " +
                ((TeslaTank) activeUnits.get(3)).getStats().equals(((TeslaTank) activeUnits.get(3 + rand)).getStats()));
        System.out.println("");

        rand = 3*(int) (Math.random() * 333330);
        System.out.println(activeUnits.get(4));
        System.out.println(activeUnits.get(4 + rand));
        System.out.println("Element 4 jest równy elementowi " + (5 + rand) + ": " +
                ((Rifleman) activeUnits.get(4)).getStats().equals(((Rifleman) activeUnits.get(4 + rand)).getStats()));

    }
}
