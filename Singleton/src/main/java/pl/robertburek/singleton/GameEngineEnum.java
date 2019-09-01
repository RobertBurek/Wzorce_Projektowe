package pl.robertburek.singleton;

/**
 * Created by Robert Burek
 */
public enum GameEngineEnum {

    INSTANCE("Robert");

    private int hp = 100;
    private String characterName = "";

    GameEngineEnum(String name) {
        this.characterName = name;
    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmienamy stan gry
            //renderujemy grafike
        }
    }
}
