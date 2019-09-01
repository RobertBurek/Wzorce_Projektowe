package pl.robertburek;

import pl.robertburek.singleton.GameEngine;

public class Main {

    public static void main(String[] args) {

        GameEngine engine = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();

        System.out.println("To są te same instancje: " + (engine == engine2));
    }
}
