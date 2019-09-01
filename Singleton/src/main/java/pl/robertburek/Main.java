package pl.robertburek;

import pl.robertburek.singleton.GameEngineEnum;
import pl.robertburek.singleton.GuessGame;

public class Main {

    public static void main(String[] args) {

        GameEngineEnum engine = GameEngineEnum.INSTANCE;
        GameEngineEnum engine2 = GameEngineEnum.INSTANCE;
        System.out.println("To są te same instancje: " + (engine == engine2));
        System.out.println("---------------------------------");

        GuessGame game = GuessGame.getInstance();
        game.play();
        int score = game.getScore();
        GuessGame anotherGameReference = GuessGame.getInstance();
        if (game == anotherGameReference) {
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
}
