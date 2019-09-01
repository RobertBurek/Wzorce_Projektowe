package pl.robertburek.singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    public static final long serialVersionUID = 25131531;

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine();

    private GameEngine() {
    }

    public static GameEngine getInstance() {
        return instance;
    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmienamy stan gry
            //renderujemy grafike
        }
    }

    protected Object readResolved() {
        return getInstance();
    }
}
