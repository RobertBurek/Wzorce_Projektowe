package pl.robertburek;

import pl.robertburek.singleton.GameEngineEnum;

public class Main {

    public static void main(String[] args) {

        GameEngineEnum engine = GameEngineEnum.INSTANCE;
        GameEngineEnum engine2 = GameEngineEnum.INSTANCE;

        System.out.println("To są te same instancje: " + (engine == engine2));
    }
}
