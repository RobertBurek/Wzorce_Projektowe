package pl.robertburek.singleton;

public class GameEngine {

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
}
