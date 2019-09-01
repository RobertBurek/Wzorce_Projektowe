package pl.robertburek.singleton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";

    // 3) private static GameEngine instance = new GameEngine();
    // 3) tworzenie instancji w lini deklaracji, wtedy getInstance() tylko zwraca instance;
    private static GameEngine instance;

    private GameEngine() {
    }

    //    public synchronized static GameEngine getInstance() { //1) synchronizacja na całą metodę
    public static GameEngine getInstance() {
        if (instance == null) {                                                                                 //3) usuń
            synchronized (GameEngine.class) { //2) dodatkowy blok synchronizacji tylko na tworzenie instancji  //3) usuń
                instance = new GameEngine();                                                                    //3) usuń
            }                                 //2) dodatkowy blok synchronizacji tylko na tworzenie instancji   //3) usuń
        }                                                                                                       //3) usuń
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
